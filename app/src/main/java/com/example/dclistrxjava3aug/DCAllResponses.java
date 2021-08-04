package com.example.dclistrxjava3aug;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DCAllResponses {

    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("Remark")
    @Expose
    private String remark;
    @SerializedName("ProviderList")
    @Expose
    private List<Provider> providerList = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<Provider> getProviderList() {
        return providerList;
    }

    public void setProviderList(List<Provider> providerList) {
        this.providerList = providerList;
    }

}
