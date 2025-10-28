package com.chinese.e_commerce_backend.entities;
import jakarta.persistence.*;
import org.w3c.dom.Text;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
    public Product(String productName, double productPrice, int productStock) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
    }




}
