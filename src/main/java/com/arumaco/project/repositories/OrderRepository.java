package com.arumaco.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arumaco.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
