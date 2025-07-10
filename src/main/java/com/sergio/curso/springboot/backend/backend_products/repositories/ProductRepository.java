package com.sergio.curso.springboot.backend.backend_products.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sergio.curso.springboot.backend.backend_products.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

    
}
