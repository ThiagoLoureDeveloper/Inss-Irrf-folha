package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Inss;
import com.example.demo.service.InssService;

@RestController
@RequestMapping("/inss")
public class InssController {

	@Autowired
	private InssService service;

	@GetMapping
	public ResponseEntity<List<Inss>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@PostMapping
	public Inss Post(@RequestBody Inss inss) {
		return service.save(inss);
	}

}
