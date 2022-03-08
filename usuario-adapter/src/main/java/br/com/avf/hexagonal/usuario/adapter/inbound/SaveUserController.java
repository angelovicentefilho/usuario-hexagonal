package br.com.avf.hexagonal.usuario.adapter.inbound;

import br.com.avf.hexagonal.usuario.adapter.inbound.mappers.UserCodec;
import br.com.avf.hexagonal.usuario.adapter.inbound.protocols.UserRequest;
import br.com.avf.hexagonal.usuario.domains.User;
import br.com.avf.hexagonal.usuario.ports.in.SaveUserInPort;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-08, Tuesday
 */
@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class SaveUserController {

    private final SaveUserInPort inPort;
    private final UserCodec codec;

    @PostMapping
    public User save(@RequestBody UserRequest request) {
        return inPort.save(codec.encode(request), request.getZipCode());
    }

}
