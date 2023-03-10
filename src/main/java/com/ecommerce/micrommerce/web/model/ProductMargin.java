package com.ecommerce.micrommerce.web.model;

public class ProductMargin {

    private final String productName;

    private final Integer margin;

    public ProductMargin(Product product) {
        productName = product.toString();
        margin = product.getPrix() - product.getPrixAchat();
    }

    public String getProductName() {
        return productName;
    }

    public Integer getMargin() {
        return margin;
    }

    @Override
    public String toString() {
        return "ProductMargin{" +
                "productName='" + productName + '\'' +
                ", margin=" + margin +
                '}';
    }
}