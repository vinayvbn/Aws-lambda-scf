package com.aws.lamda.domain;

import java.io.Serializable;

public class ProductReq implements Serializable {
    String ProductId;

    public ProductReq() {
    }

    public ProductReq(String productId) {
        ProductId = productId;
    }

    public String getProductId() {
        return ProductId;
    }

    // private static final long serialVersionUID = -2029625279874717013L;

    public void setProductId(String productId) {
        ProductId = productId;
    }
}
