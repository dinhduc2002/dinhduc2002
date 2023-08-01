package com.example.demo.serviecs;

import com.example.demo.moDel.productDetails;
import com.example.demo.moDel.products;
import com.example.demo.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductsServices implements IProductsServices{
    @Autowired
    private com.example.demo.repo.productDetailPropertyDetailsRepo productDetailPropertyDetailsRepo;
    @Autowired
    private com.example.demo.repo.productDetailsRepo productDetailsRepo;
    @Autowired
    private com.example.demo.repo.productsRepo productsRepo;
    @Autowired
    private com.example.demo.repo.propertiesRepo propertiesRepo;
    @Autowired
    private com.example.demo.repo.propertyDetailsRepo propertyDetailsRepo;

}

