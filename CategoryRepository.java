package com.itvedant.grocerystore.repositories;

import org.springframework.data.repository.CrudRepository;

import com.itvedant.grocerystore.entities.Category;

public interface CategoryRepository extends CrudRepository <Category,Integer> {
    
}
