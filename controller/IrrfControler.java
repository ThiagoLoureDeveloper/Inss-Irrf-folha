package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Irrf;
import com.example.demo.service.IrrfService;

@RestController
@RequestMapping("/irrf")
public class IrrfControler {

	@Autowired
	private IrrfService service;

	@GetMapping()
	public ResponseEntity<List<Irrf>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@PostMapping
	public Irrf Post(@RequestBody Irrf irrf) {
		return service.save(irrf);
	}

}
