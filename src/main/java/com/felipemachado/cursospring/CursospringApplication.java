package com.felipemachado.cursospring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.felipemachado.cursospring.domain.Categoria;
import com.felipemachado.cursospring.repositories.CategoriaRepository;

@SpringBootApplication
public class CursospringApplication implements CommandLineRunner {
	@Autowired
	private CategoriaRepository repo; 

	public static void main(String[] args) {
		SpringApplication.run(CursospringApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null,"Viajem");
		Categoria cat2 = new Categoria(null,"informatica");
		repo.saveAll(Arrays.asList(cat1,cat2));
		
	}
}
