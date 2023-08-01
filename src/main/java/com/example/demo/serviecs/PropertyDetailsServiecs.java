package com.example.demo.serviecs;

import com.example.demo.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyDetailsServiecs implements IPropertyDetailsServiecs{
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
