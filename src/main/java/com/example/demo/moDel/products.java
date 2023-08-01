package com.example.demo.moDel;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "products")
public class products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productsid")
    private int ProductsId;
    @Column(name = "productname")
    private String ProductName;


    @OneToMany(mappedBy = "products",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<properties> properties;
    @OneToMany(mappedBy = "products",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<productDetailPropertyDetails> propertyDetails;

    public int getProductId() {
        return ProductsId;
    }

    public void setProductId(int ProductsId) {
        ProductsId = ProductsId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public List<com.example.demo.moDel.properties> getProperties() {
        return properties;
    }

    public void setProperties(List<com.example.demo.moDel.properties> properties) {
        this.properties = properties;
    }

    public List<productDetailPropertyDetails> getPropertyDetails() {
        return propertyDetails;
    }

    public void setPropertyDetails(List<productDetailPropertyDetails> propertyDetails) {
        this.propertyDetails = propertyDetails;
    }
}
