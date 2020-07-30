package com.example.demo.repositories;

import com.example.demo.entities.PostCategory;
import org.springframework.data.repository.CrudRepository;

public interface PostCategoryRepository extends CrudRepository<PostCategory, Integer> {

}