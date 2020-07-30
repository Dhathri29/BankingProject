package com.dhathri.demo.Repo;

import org.springframework.data.repository.CrudRepository;

import com.dhathri.demo.model.Item;

public interface ItemRepository extends CrudRepository<Item, Integer>{
	
}
