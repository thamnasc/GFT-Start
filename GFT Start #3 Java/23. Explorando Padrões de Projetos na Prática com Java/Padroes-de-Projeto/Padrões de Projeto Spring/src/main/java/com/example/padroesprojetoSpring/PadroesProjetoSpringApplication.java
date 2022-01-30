package com.example.padroesprojetoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Projeto Spring Boot gerado pelo Spring Initializr
 * Módulos selecionados:
 * - Spring Data JPÁ
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * 
 * @author thamnasc
 */

@EnableFeignClients
@SpringBootApplication
public class PadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesProjetoSpringApplication.class, args);
	}

}
