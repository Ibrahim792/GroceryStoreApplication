package com.itvedant.grocerystore.repositories;

import org.springframework.data.repository.CrudRepository;

import com.itvedant.grocerystore.entities.Order;

public interface OrderRepository extends CrudRepository <Order,Integer>{
    
}

