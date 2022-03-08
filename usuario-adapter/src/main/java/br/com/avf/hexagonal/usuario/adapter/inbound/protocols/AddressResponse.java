package br.com.avf.hexagonal.usuario.adapter.inbound.protocols;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-08, Tuesday
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponse {
    @JsonProperty("cep")
    private String zipCode;
    @JsonProperty("logradouro")
    private String route;
    @JsonProperty("localidade")
    private String city;
    @JsonProperty("uf")
    private String uf;
}
