package com.ander.aldeamo.controller;


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ander.aldeamo.modelo.Array;
import com.ander.aldeamo.service.IArrayService;




@RestController
@RequestMapping("resolver")
public class ArrayController {

	@Autowired
	private IArrayService service;
	
	@GetMapping("/datos")
	public ResponseEntity<Array> traerTodos(@RequestParam int idprestamo,@RequestParam int iteraciones) {
		
		Array resultado=service.resolver(idprestamo,iteraciones);
		if(resultado!=null) {
			return ResponseEntity.ok(resultado);
		}
		return ResponseEntity.notFound().build();
	}
	

	

	
}
