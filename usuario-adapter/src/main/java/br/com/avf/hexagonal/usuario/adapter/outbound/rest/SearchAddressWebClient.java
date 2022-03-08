package br.com.avf.hexagonal.usuario.adapter.outbound.rest;

import br.com.avf.hexagonal.usuario.adapter.inbound.protocols.AddressResponse;
import br.com.avf.hexagonal.usuario.domains.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-08, Tuesday
 */
@FeignClient(name = "searchZipCode", url = "https://viacep.com.br")
public interface SearchAddressWebClient {

    @GetMapping("/ws/{zipCode}/json")
    ResponseEntity<AddressResponse> search(@PathVariable String zipCode);
}
