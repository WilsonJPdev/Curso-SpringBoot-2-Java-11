package com.wilsonjp.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wilsonjp.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
