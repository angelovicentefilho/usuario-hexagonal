package br.com.avf.hexagonal.usuario.adapter.inbound.protocols;

import lombok.Data;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-08, Tuesday
 */
@Data
public class UserRequest {
    private String name;
    private int age;
    private String zipCode;
}
