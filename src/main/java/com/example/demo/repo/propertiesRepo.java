package com.example.demo.repo;

import com.example.demo.moDel.properties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface propertiesRepo extends JpaRepository<properties,Integer> {
}
