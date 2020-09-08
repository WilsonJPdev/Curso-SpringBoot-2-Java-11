package com.wilsonjp.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wilsonjp.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
