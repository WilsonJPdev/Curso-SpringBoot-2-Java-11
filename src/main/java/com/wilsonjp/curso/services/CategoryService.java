package com.wilsonjp.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wilsonjp.curso.entities.Category;
import com.wilsonjp.curso.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category infById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
