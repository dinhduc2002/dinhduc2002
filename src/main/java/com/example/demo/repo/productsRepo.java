package com.example.demo.repo;

import com.example.demo.moDel.products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productsRepo extends JpaRepository<products, Integer> {
}
