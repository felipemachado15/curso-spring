package com.felipemachado.cursospring.resources.exceptions;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.felipemachado.cursospring.services.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	//pegamos o erro que gostariamos de tratar 
	@ExceptionHandler(ObjectNotFoundException.class)
	//usamos este metodo para personalizar nosso erro utilizando a classe standardError
	public ResponseEntity<StandardError>objectNotFound(ObjectNotFoundException e ,HttpServletRequest request){
		//instanciamos nosso obj StandardError para popular seus dados ou seja formatando nossos erros 
		StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}

}
