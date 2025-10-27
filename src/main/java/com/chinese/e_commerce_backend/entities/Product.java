package com.chinese.e_commerce_backend.entities;
import jakarta.persistence.*;
import org.w3c.dom.Text;

@Entity
@Table(
        name = "products",
        uniqueConstraints = {
                @UniqueConstraint(name="product_name_unique", columnNames = "product_name")
        }
)
public class Product {

    @Id
    @SequenceGenerator(
            name = "product_id_Sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_id_Sequence"
    )
    @Column(
            name = "id"
    )
    private Long productId;
    @Column(
            name="product_name",
            nullable = false,
            columnDefinition = "TEXT"

    )
    private String productName;
    @Column(
            name="product_price",
            nullable = false

    )
    private double productPrice;
    @Column(
            name="product_stock",
            nullable = false
    )
    private int productStock;
    public Product() {};

     public Product(String productName,double productPrice,int productStock){

        this.productName=productName;
        this.productPrice=productPrice;
        this.productStock=productStock;

    }

    public Long getProductId() {
        return productId;
    }
    public void setProductId(Long productId) {
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
