package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Irrf;
import com.example.demo.repository.IrrfRepository;

@Service 
public class IrrfService {
	
	@Autowired
	private IrrfRepository repository;
	
	public List<Irrf> findAll(){
		return repository.findAll();
	}

	public Irrf save(Irrf irrf) {
		return repository.save(irrf);
	}
	
}
