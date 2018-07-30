package com.felipemachado.cursospring.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.felipemachado.cursospring.domain.Categoria;
import com.felipemachado.cursospring.services.CategoriaService;
//COLOCANDO UM INDICADOR QUE ESSA CLASSE É UM REST CONTROLLER
@RestController
//COLOCA QUE AS FUNCIONALIDADES DESTE RECURSOS ESTÃO EM /CATEGORIA
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	@Autowired
	private CategoriaService service;
//COLOCA QUE ESTE METODO SERIA EXECUTADO EM /CATEGORIAS/IDPROCURADO,ENFATIZANDO QUE O METODO REQUEST É CRUCIAL PARA O TIPO DE OPERAÇÃO DO METODO
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}

}
