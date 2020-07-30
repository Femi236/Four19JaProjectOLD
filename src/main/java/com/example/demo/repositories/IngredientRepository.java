package com.example.demo.Repositories;

import com.example.demo.entities.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, Integer>{
}
