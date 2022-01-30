package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Livro livro = factory.getBean(Livro.class);
		livro.setNome("Senhor dos Anéis");
		livro.setCodigo("SDA1200");
		
		Autor autor = factory.getBean(Autor.class);
		autor.setNome("J.R.R. Tolkien");
		
		livro.exibir();
	}

}
