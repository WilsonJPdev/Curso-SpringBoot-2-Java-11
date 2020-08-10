package com.wilsonjp.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wilsonjp.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
