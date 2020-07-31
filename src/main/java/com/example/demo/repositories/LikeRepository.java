package com.example.demo.repositories;


import com.example.demo.entities.Like;
import org.springframework.data.repository.CrudRepository;

public interface LikeRepository extends CrudRepository<Like,Integer> {
}
