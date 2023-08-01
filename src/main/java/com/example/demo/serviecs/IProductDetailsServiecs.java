package com.example.demo.serviecs;

import com.example.demo.moDel.productDetails;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IProductDetailsServiecs {
 public String muaSanPham(int productsDetailsId,int quantity);
 public boolean updateQuanTiTy(int productsDetailsId, int newQuanTiTy);

 public List<productDetails> getAll();

 }
