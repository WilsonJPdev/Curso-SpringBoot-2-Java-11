package com.wilsonjp.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wilsonjp.curso.entities.Order;
import com.wilsonjp.curso.entities.User;
import com.wilsonjp.curso.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order infById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
