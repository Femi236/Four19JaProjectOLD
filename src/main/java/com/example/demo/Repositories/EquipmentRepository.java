package com.example.demo.Repositories;

import com.example.demo.Entity.Equipment;
import org.springframework.data.repository.CrudRepository;

public interface EquipmentRepository extends CrudRepository<Equipment, Integer> {
}
