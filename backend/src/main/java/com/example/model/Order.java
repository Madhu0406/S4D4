package com.example.model;

import javax.persistence.*;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String product;

    public Order() {}

    public Order(String product) {
        this.product = product;
    }


    public Long getId() {
        return id;
    }

    public String getProduct() {
        return product;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
