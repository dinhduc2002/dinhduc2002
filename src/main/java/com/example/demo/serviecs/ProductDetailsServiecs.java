package com.example.demo.serviecs;

import com.example.demo.moDel.productDetails;
import com.example.demo.repo.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.*;

@Service
public class ProductDetailsServiecs implements IProductDetailsServiecs {
    @Autowired
    private productDetailPropertyDetailsRepo productDetailPropertyDetailsRepo;
    @Autowired
    private productDetailsRepo productDetailsRepo;
    @Autowired
    private productsRepo productsRepo;
    @Autowired
    private propertiesRepo propertiesRepo;
    @Autowired
    private propertyDetailsRepo propertyDetailsRepo;

    @Override
    public String muaSanPham(int productsDetailsId, int quantity) {
        Optional<productDetails> optionalProductDetails = productDetailsRepo.findById(productsDetailsId);
        if (optionalProductDetails.isEmpty()) {
            return "San Pham Khong Ton Tai";
        }
        productDetails productDetails = optionalProductDetails.get();
        if (productDetails.getQuantity() == 0) {
            return "San Pham Het Hang";
        }
        if (productDetails.getQuantity() < quantity) {
            return "San Pham Khong Du Hang";
        }
        int quanMoi = productDetails.getQuantity() - quantity;
        productDetails.setQuantity(quanMoi);
        productDetailsRepo.save(productDetails);
        return "Mua Thanh Cong";
    }

    @Override
    public boolean updateQuanTiTy(int productsDetailsId, int newQuanTiTy) {
        productDetails productDetails = productDetailsRepo.findById(productsDetailsId).orElse(null);
        if (productDetails == null){
            return false;
        }
        productDetails.setQuantity(newQuanTiTy);
        productDetailsRepo.save(productDetails);
        return true;
    }

    @Override
    public List<productDetails> getAll() {
        return productDetailsRepo.findByParentIdIsNull();
    }
}
