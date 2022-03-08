package br.com.avf.hexagonal.usuario.adapter.inbound.mappers;

import br.com.avf.hexagonal.usuario.adapter.inbound.entities.AddressEntity;
import br.com.avf.hexagonal.usuario.adapter.inbound.entities.UserEntity;
import br.com.avf.hexagonal.usuario.adapter.inbound.protocols.AddressResponse;
import br.com.avf.hexagonal.usuario.adapter.inbound.protocols.UserRequest;
import br.com.avf.hexagonal.usuario.domains.Address;
import br.com.avf.hexagonal.usuario.domains.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-08, Tuesday
 */
@Component
public class UserCodec {

    public User encode(UserRequest request) {
        User user = new User();
        BeanUtils.copyProperties(request, user);
        return user;
    }

    public Address encode(AddressResponse response) {
        Address address = new Address();
        BeanUtils.copyProperties(response, address);
        return address;
    }

    public User encode(UserEntity entity) {
        User user = new User();
        BeanUtils.copyProperties(entity, user);
        return user;
    }

    public UserEntity decode(User user) {
        UserEntity entity = new UserEntity();
        BeanUtils.copyProperties(user, entity);
        return entity;
    }

    public AddressEntity decode(Address address) {
        AddressEntity entity = new AddressEntity();
        BeanUtils.copyProperties(address, entity);
        return entity;
    }
}
