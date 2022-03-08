package br.com.avf.hexagonal.usuario.adapter.configurations;

import br.com.avf.hexagonal.usuario.adapter.outbound.SaveUserAdapter;
import br.com.avf.hexagonal.usuario.adapter.outbound.SearchAddressAdapter;
import br.com.avf.hexagonal.usuario.services.SaveUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-08, Tuesday
 */

@Configuration
public class UserServiceConfiguration {

    @Bean
    public SaveUserService saveUserService(SaveUserAdapter saveUserAdapter, SearchAddressAdapter searchAddressAdapter) {
        return new SaveUserService(saveUserAdapter, searchAddressAdapter);
    }
}
