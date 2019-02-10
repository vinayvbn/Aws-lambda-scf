package com.aws.lamda.domain;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.io.Serializable;

@DynamoDBTable(tableName = "product_tble")
public class Product implements Serializable {
    private static final long serialVersionUID = -6089714861253500008L;
    @DynamoDBHashKey(attributeName = "product_name")
    String productName;
    @DynamoDBAttribute(attributeName = "product_type")
    String prouductType;
    @DynamoDBAttribute(attributeName = "product_price")
    Double price;
    @DynamoDBAttribute(attributeName = "proudct_desc")
    String description;
    @DynamoDBAttribute(attributeName = "roduct_qnty")
    Integer quantity;
    @DynamoDBAttribute(attributeName = "product_dlvry")
    String deliveryWithIn;

    public Product(String productName, String prouductType, Double price, String description, Integer quantity, String deliveryWithIn) {

        this.productName = productName;
        this.prouductType = prouductType;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.deliveryWithIn = deliveryWithIn;
    }


    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProuductType() {
        return prouductType;
    }

    public void setProuductType(String prouductType) {
        this.prouductType = prouductType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDeliveryWithIn() {
        return deliveryWithIn;
    }

    public void setDeliveryWithIn(String deliveryWithIn) {
        this.deliveryWithIn = deliveryWithIn;
    }


}


