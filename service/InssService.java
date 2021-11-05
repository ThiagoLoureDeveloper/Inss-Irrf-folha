package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Inss;
import com.example.demo.repository.InssRepository;

@Service
public class InssService {
	
	@Autowired// para ter acesso aos metodos do repository
	private InssRepository repository;
	
	public List<Inss> findAll(){
		return repository.findAll();
		
	}
	
	public Inss save(Inss inss) {
		return repository.save(inss);
	}
	
	
}
