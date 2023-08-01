package com.example.demo.moDel;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "productdetails")
public class productDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productdetailid")
    private int ProductDetailId;
    @Column(name = "productdetailname")
    private String ProductDetailName;
    @Column(name = "quantity")
    private int Quantity;
    @Column(name = "price")
    private float Price;
    @Column(name = "shellprice")
    private float ShellPrice;
    @Column(name = "parent_id")
    private Integer parentId;
    @OneToMany(mappedBy = "productDetails",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<productDetailPropertyDetails> propertyDetails;

    public int getProductDetailId() {
        return ProductDetailId;
    }

    public void setProductDetailId(int productDetailId) {
        ProductDetailId = productDetailId;
    }

    public String getProductDetailName() {
        return ProductDetailName;
    }

    public void setProductDetailName(String productDetailName) {
        ProductDetailName = productDetailName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public float getShellPrice() {
        return ShellPrice;
    }

    public void setShellPrice(float shellPrice) {
        ShellPrice = shellPrice;
    }

    public List<productDetailPropertyDetails> getPropertyDetails() {
        return propertyDetails;
    }

    public void setPropertyDetails(List<productDetailPropertyDetails> propertyDetails) {
        this.propertyDetails = propertyDetails;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
}
