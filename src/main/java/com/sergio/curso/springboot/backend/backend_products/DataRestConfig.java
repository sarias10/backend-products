package com.sergio.curso.springboot.backend.backend_products;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.sergio.curso.springboot.backend.backend_products.entities.Product;

@Configuration //le dice a Spring que esta clase tiene configuraciones.
               // si creo un @Bean dentro de esta clase. Luego lo puedo inyectar en cualquier parte de la App con @Autowired
public class DataRestConfig implements RepositoryRestConfigurer{

    // esto hace que los ids se expongan en la respuesta del json al hacer GET
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(Product.class);
    }

    
}
