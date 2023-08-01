package com.example.demo.moDel;

import jakarta.persistence.*;

@Entity
@Table(name = "productdetailpropertydetails")
public class productDetailPropertyDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="productdetailpropertydetailid" )
    private int ProductDetailPropertyDetailId;
    @ManyToOne
    @JoinColumn(name = "propertydetailid")
    private propertyDetails propertyDetails;

    @ManyToOne
    @JoinColumn(name = "productid")
    private products products;

    @ManyToOne
    @JoinColumn(name = "productdetailid")
    private productDetails productDetails;

    public int getProductDetailPropertyDetailId() {
        return ProductDetailPropertyDetailId;
    }

    public void setProductDetailPropertyDetailId(int productDetailPropertyDetailId) {
        ProductDetailPropertyDetailId = productDetailPropertyDetailId;
    }

    public com.example.demo.moDel.propertyDetails getPropertyDetails() {
        return propertyDetails;
    }

    public void setPropertyDetails(com.example.demo.moDel.propertyDetails propertyDetails) {
        this.propertyDetails = propertyDetails;
    }

    public com.example.demo.moDel.products getProducts() {
        return products;
    }

    public void setProducts(com.example.demo.moDel.products products) {
        this.products = products;
    }

    public com.example.demo.moDel.productDetails getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(com.example.demo.moDel.productDetails productDetails) {
        this.productDetails = productDetails;
    }



}
