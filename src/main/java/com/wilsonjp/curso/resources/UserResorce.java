package com.wilsonjp.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wilsonjp.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResorce {

	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1L, "Juliana", "juliana@gmail.com", "1195741425", "123456");
		return ResponseEntity.ok().body(u);
	}
}
