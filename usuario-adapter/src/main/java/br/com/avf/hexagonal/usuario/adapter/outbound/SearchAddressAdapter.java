package br.com.avf.hexagonal.usuario.adapter.outbound;

import br.com.avf.hexagonal.usuario.adapter.inbound.mappers.UserCodec;
import br.com.avf.hexagonal.usuario.adapter.inbound.protocols.AddressResponse;
import br.com.avf.hexagonal.usuario.adapter.outbound.rest.SearchAddressWebClient;
import br.com.avf.hexagonal.usuario.domains.Address;
import br.com.avf.hexagonal.usuario.ports.out.SearchZipCodeOutPort;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-08, Tuesday
 */
@Component
@AllArgsConstructor
public class SearchAddressAdapter implements SearchZipCodeOutPort {

    private final SearchAddressWebClient webClient;
    private final UserCodec codec;

    @Override
    public Address search(String zipCode) {
        ResponseEntity<AddressResponse> address = webClient.search(zipCode);
        return codec.encode(address.getBody());
    }
}
