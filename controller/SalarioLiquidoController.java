package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.SalarioLiquido;
import com.example.demo.service.SalarioLiquidoService;

@RestController // por ser um api rest no controller devo implementar
@RequestMapping("/salarioliquido")
public class SalarioLiquidoController {

	@Autowired
	private SalarioLiquidoService service;

	@GetMapping()
	public ResponseEntity<List<SalarioLiquido>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@PostMapping
	public SalarioLiquido Post(@RequestBody SalarioLiquido salarioLiquido) {
		return service.save(salarioLiquido);

	}

}
