package com.example.dclistrxjava3aug;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Provider {


    @SerializedName("ProviderCode")
    @Expose
    private Integer providerCode;
    @SerializedName("ProviderName")
    @Expose
    private String providerName;
    @SerializedName("Grade")
    @Expose
    private String grade;
    @SerializedName("Address")
    @Expose
    private String address;
    @SerializedName("City")
    @Expose
    private String city;
    @SerializedName("State")
    @Expose
    private String state;
    @SerializedName("Pincode")
    @Expose
    private String pincode;
    @SerializedName("TestDetails")
    @Expose
    private String testDetails;
    @SerializedName("VisitType")
    @Expose
    private String visitType;

    public Integer getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(Integer providerCode) {
        this.providerCode = providerCode;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getTestDetails() {
        return testDetails;
    }

    public void setTestDetails(String testDetails) {
        this.testDetails = testDetails;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }
}
