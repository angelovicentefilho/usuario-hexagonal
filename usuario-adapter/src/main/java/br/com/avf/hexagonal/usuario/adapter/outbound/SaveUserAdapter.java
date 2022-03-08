package br.com.avf.hexagonal.usuario.adapter.outbound;

import br.com.avf.hexagonal.usuario.adapter.inbound.entities.AddressEntity;
import br.com.avf.hexagonal.usuario.adapter.inbound.entities.UserEntity;
import br.com.avf.hexagonal.usuario.adapter.inbound.mappers.UserCodec;
import br.com.avf.hexagonal.usuario.adapter.outbound.repository.UserRepository;
import br.com.avf.hexagonal.usuario.domains.User;
import br.com.avf.hexagonal.usuario.ports.out.SaveUserOutPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-08, Tuesday
 */
@Component
@AllArgsConstructor
public class SaveUserAdapter implements SaveUserOutPort {

    private final UserRepository repository;
    private final UserCodec codec;

    @Override
    public User save(User user) {
        UserEntity userEntity = codec.decode(user);
        AddressEntity addressEntity = codec.decode(user.getAddress());
        userEntity.setAddress(addressEntity);
        return codec.encode(repository.save(userEntity));
    }
}
