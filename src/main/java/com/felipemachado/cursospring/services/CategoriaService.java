package com.felipemachado.cursospring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipemachado.cursospring.domain.Categoria;
import com.felipemachado.cursospring.repositories.CategoriaRepository;
import com.felipemachado.cursospring.services.exceptions.ObjectNotFoundException;
@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		//chamamos nosso objeto da excessão e lançamos o erro
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));

	}

}
