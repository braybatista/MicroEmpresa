package com.digitalware.test.Microempresa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class MicroempresaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroempresaApplication.class, args);
	}

}
