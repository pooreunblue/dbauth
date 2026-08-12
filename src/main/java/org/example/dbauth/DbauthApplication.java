package org.example.dbauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DbauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbauthApplication.class, args);
    }

}
