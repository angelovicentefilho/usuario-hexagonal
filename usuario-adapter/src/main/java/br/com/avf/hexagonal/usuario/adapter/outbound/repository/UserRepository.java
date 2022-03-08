package br.com.avf.hexagonal.usuario.adapter.outbound.repository;

import br.com.avf.hexagonal.usuario.adapter.inbound.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-08, Tuesday
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
