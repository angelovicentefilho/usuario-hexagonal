package br.com.avf.hexagonal.usuario.adapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UsuarioAdapterApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsuarioAdapterApplication.class, args);
    }

}
