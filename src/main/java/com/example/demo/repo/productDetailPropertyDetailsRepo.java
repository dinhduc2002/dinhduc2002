package com.example.demo.repo;

import com.example.demo.moDel.productDetailPropertyDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productDetailPropertyDetailsRepo extends JpaRepository<productDetailPropertyDetails,Integer> {
}
