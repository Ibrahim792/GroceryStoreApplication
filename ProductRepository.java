package com.itvedant.grocerystore.repositories;

import org.springframework.data.repository.CrudRepository;

import com.itvedant.grocerystore.entities.Product;

public interface ProductRepository extends CrudRepository <Product,Integer> {
       
}