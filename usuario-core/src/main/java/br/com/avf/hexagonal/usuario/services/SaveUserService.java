package br.com.avf.hexagonal.usuario.services;

import br.com.avf.hexagonal.usuario.domains.Address;
import br.com.avf.hexagonal.usuario.domains.User;
import br.com.avf.hexagonal.usuario.ports.in.SaveUserInPort;
import br.com.avf.hexagonal.usuario.ports.out.SaveUserOutPort;
import br.com.avf.hexagonal.usuario.ports.out.SearchZipCodeOutPort;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-08, Tuesday
 */
public class SaveUserService implements SaveUserInPort {

    private final SaveUserOutPort outPort;
    private final SearchZipCodeOutPort zipCodeOutPort;

    public SaveUserService(SaveUserOutPort outPort, SearchZipCodeOutPort zipCodeOutPort) {
        this.outPort = outPort;
        this.zipCodeOutPort = zipCodeOutPort;
    }

    public User save(User user, String zipCode) {
        Address address = zipCodeOutPort.search(zipCode);
        user.setAddress(address);
        return outPort.save(user);
    }
}
