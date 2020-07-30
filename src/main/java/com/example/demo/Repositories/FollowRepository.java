package com.example.demo.Repositories;

import com.example.demo.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface FollowRepository extends CrudRepository<User, Integer> {
}
