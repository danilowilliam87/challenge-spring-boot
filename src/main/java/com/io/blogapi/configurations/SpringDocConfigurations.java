package com.io.blogapi.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SpringDocConfigurations{
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                    .title("Blog API")
                    .description("API Rest do Blog")
                    .contact(new Contact()
                        .name("Time Backend")
                        .email("blog-back@email.com"))
                    .license(new License()
                        .name("Apache 2.0")
                        .url("http://blog-api//common-licence")));
    }
    
}