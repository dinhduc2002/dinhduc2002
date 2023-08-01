package com.example.demo.repo;

import com.example.demo.moDel.productDetails;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface productDetailsRepo extends JpaRepository<productDetails, Integer> {
    List<productDetails> findByParentIdIsNull();

}
