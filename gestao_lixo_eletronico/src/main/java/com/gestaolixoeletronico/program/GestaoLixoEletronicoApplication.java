package com.gestaolixoeletronico.program;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GestaoLixoEletronicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoLixoEletronicoApplication.class, args);
	}

	@Bean
	public CommandLineRunner inicializacao() {
		return args -> {
			System.out.println("Funcionou!");
		};
	}
}
