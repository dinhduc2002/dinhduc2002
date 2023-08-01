package com.example.demo.controller;

import com.example.demo.moDel.productDetails;
import com.example.demo.serviecs.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/API/BaiTest")
public class testController {
    @Autowired
    private ProductDetailPropertyDetailsServiecs productDetailPropertyDetailsServiecs;
    @Autowired
    private ProductDetailsServiecs productDetailsServiecs;
    @Autowired
    private ProductsServices productsServicesp;
    @Autowired
    private PropertiesServiecs propertiesServiecs;
    @Autowired
    private PropertyDetailsServiecs propertyDetailsServiecs;


    @PostMapping(value = "/muaSanPham")
    public ResponseEntity<String> muaSanPham(@RequestParam int productIdDetails,
                                             @RequestParam int quantity){
        String string = productDetailsServiecs.muaSanPham(productIdDetails,quantity);
        return ResponseEntity.ok(string);

    }

    @PutMapping(value = "/capNhatSanPham")
    public ResponseEntity<String> capNhatSanPham(@RequestParam int productIdDetailsId,
                                                 @RequestParam int newQUanTiTy){
        boolean thanhCong  = productDetailsServiecs.updateQuanTiTy(productIdDetailsId,newQUanTiTy);
        if(thanhCong){
            return ResponseEntity.ok("So Luong Da Duoc Cap Nhat");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Khong Tim Thay San Pham");
    }

    @GetMapping(value = "/getAll")
    public List<productDetails> getAll(){
        return productDetailsServiecs.getAll();
    }




}
