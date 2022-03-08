package br.com.avf.hexagonal.usuario.adapter.inbound.entities;

import br.com.avf.hexagonal.usuario.domains.Address;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-08, Tuesday
 */
@Entity
@Getter
@Setter
@Table(name = "tbl_addresses")
public class AddressEntity extends Address {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
