package com.example.demo.repositories;

import com.example.demo.entities.PostIngredients;
import org.springframework.data.repository.CrudRepository;

public interface PostIngredientsRepository extends CrudRepository<PostIngredients, Integer> {
}
