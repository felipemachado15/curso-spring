package com.felipemachado.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipemachado.cursospring.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
