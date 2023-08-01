package com.example.demo.moDel;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "propertydetails")
public class propertyDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "propertydetailid")
    private int PropertyDetailId;
    @Column(name = "propertydetailcode")
    private String PropertyDetailCode;
    @Column(name = "propertydetaildetail")
    private String PropertyDetailDetail;

    @ManyToOne
    @JoinColumn(name = "propertiesid")
    private properties properties;
    @OneToMany(mappedBy = "propertyDetails",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<productDetailPropertyDetails> propertyDetails;


    public int getPropertyDetailId() {
        return PropertyDetailId;
    }

    public void setPropertyDetailId(int propertyDetailId) {
        PropertyDetailId = propertyDetailId;
    }

    public String getPropertyDetailCode() {
        return PropertyDetailCode;
    }

    public void setPropertyDetailCode(String propertyDetailCode) {
        PropertyDetailCode = propertyDetailCode;
    }

    public String getPropertyDetailDetail() {
        return PropertyDetailDetail;
    }

    public void setPropertyDetailDetail(String propertyDetailDetail) {
        PropertyDetailDetail = propertyDetailDetail;
    }

    public com.example.demo.moDel.properties getProperties() {
        return properties;
    }

    public void setProperties(com.example.demo.moDel.properties properties) {
        this.properties = properties;
    }

    public List<productDetailPropertyDetails> getPropertyDetails() {
        return propertyDetails;
    }

    public void setPropertyDetails(List<productDetailPropertyDetails> propertyDetails) {
        this.propertyDetails = propertyDetails;
    }
}
