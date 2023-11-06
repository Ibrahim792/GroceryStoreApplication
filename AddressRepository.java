package com.itvedant.grocerystore.repositories;

import org.springframework.data.repository.CrudRepository;

import com.itvedant.grocerystore.entities.Address;

public interface AddressRepository extends CrudRepository <Address,Integer>{    

}
