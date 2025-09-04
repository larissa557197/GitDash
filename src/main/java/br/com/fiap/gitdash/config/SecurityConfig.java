package br.com.fiap.gitdash.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    /*
    2 . SecurityConfig: nas configurações habilitar o OAuth2
     e proteger todas as rotas da aplicação web*/
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests( auth -> auth
                        .anyRequest().authenticated()
                )
                .oauth2Login(login -> login.defaultSuccessUrl("/user"))
                .build();
    }


    }



