package com.chinese.e_commerce_backend.entities;
import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @SequenceGenerator(
            name = "product_id_Sequence",
            sequenceName = "product_squence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_id_Sequence"
    )
    private int productId;
    private String productName;
    private double productPrice;
    private int productStock;

    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;

    }
    public int getProductStock() {
        return productStock;
    }
    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }
}
