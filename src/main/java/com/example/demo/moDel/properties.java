package com.example.demo.moDel;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "properties")
public class properties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "propertyid")
    private int propertiesId;
    @Column(name = "propertyname")
    private String propertiesName;
    @Column(name = "propertysort")
    private int propertySort;

    @ManyToOne
    @JoinColumn(name = "productsid")
    private products products;
    @OneToMany(mappedBy = "properties",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<propertyDetails> propertyDetails;

    public int getPropertiesId() {
        return propertiesId;
    }

    public void setPropertiesId(int propertiesId) {
        this.propertiesId = propertiesId;
    }

    public String getPropertiesName() {
        return propertiesName;
    }

    public void setPropertiesName(String propertiesName) {
        this.propertiesName = propertiesName;
    }

    public int getPropertySort() {
        return propertySort;
    }

    public void setPropertySort(int propertySort) {
        this.propertySort = propertySort;
    }

    public com.example.demo.moDel.products getProducts() {
        return products;
    }

    public void setProducts(com.example.demo.moDel.products products) {
        this.products = products;
    }

    public List<com.example.demo.moDel.propertyDetails> getPropertyDetails() {
        return propertyDetails;
    }

    public void setPropertyDetails(List<com.example.demo.moDel.propertyDetails> propertyDetails) {
        this.propertyDetails = propertyDetails;
    }
}
