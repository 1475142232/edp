package com.edp.serviceI.dto;

import com.edp.serviceI.common.BaseDto;

public class ProductDto extends BaseDto{
	private String id;

    private String productName;

    private String productDesc;

    private String productType;

    private String productOwner;

    private String productCreater;

    private String productCreatetime;

    private String productModifiedtime;

    private String productModifiedperson;

    private String productState;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc == null ? null : productDesc.trim();
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    public String getProductOwner() {
        return productOwner;
    }

    public void setProductOwner(String productOwner) {
        this.productOwner = productOwner == null ? null : productOwner.trim();
    }

    public String getProductCreater() {
        return productCreater;
    }

    public void setProductCreater(String productCreater) {
        this.productCreater = productCreater == null ? null : productCreater.trim();
    }

    public String getProductCreatetime() {
        return productCreatetime;
    }

    public void setProductCreatetime(String productCreatetime) {
        this.productCreatetime = productCreatetime == null ? null : productCreatetime.trim();
    }

    public String getProductModifiedtime() {
        return productModifiedtime;
    }

    public void setProductModifiedtime(String productModifiedtime) {
        this.productModifiedtime = productModifiedtime == null ? null : productModifiedtime.trim();
    }

    public String getProductModifiedperson() {
        return productModifiedperson;
    }

    public void setProductModifiedperson(String productModifiedperson) {
        this.productModifiedperson = productModifiedperson == null ? null : productModifiedperson.trim();
    }

    public String getProductState() {
        return productState;
    }

    public void setProductState(String productState) {
        this.productState = productState == null ? null : productState.trim();
    }
}