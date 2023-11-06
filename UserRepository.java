package com.itvedant.grocerystore.repositories;

import org.springframework.data.repository.CrudRepository;

import com.itvedant.grocerystore.entities.User;

public interface UserRepository extends CrudRepository <User,Integer> {
    
}