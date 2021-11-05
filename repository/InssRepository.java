package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Inss;


@Repository
public interface InssRepository extends JpaRepository<Inss, Long> {
	
}
