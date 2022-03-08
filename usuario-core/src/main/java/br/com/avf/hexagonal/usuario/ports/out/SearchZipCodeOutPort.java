package br.com.avf.hexagonal.usuario.ports.out;

import br.com.avf.hexagonal.usuario.domains.Address;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-08, Tuesday
 */
public interface SearchZipCodeOutPort  {

    Address search(String zipCode);
}
