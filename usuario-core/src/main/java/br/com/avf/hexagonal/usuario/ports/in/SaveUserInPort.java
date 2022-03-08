package br.com.avf.hexagonal.usuario.ports.in;

import br.com.avf.hexagonal.usuario.domains.User;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-08, Tuesday
 */
public interface SaveUserInPort {

    User save(User user, String zipCode);
}
