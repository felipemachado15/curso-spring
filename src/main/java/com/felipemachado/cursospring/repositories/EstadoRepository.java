package com.felipemachado.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipemachado.cursospring.domain.Categoria;

public interface EstadoRepository extends JpaRepository<Categoria, Integer> {

}
