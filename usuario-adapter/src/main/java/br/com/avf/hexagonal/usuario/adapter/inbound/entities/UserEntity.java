package br.com.avf.hexagonal.usuario.adapter.inbound.entities;

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
@Table(name = "tbl_users")
public class UserEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer age;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private AddressEntity address;
}
