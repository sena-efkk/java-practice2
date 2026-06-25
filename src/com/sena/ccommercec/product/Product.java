package com.sena.ccommercec.product;

import java.math.BigDecimal;

public class Product {

    private Long id;
    private String name;
    private BigDecimal price;

    public Product(Long id, String name ,BigDecimal price) {
        this.id=id;
        this.name=name;
        changePrice(price);
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public BigDecimal getPrice(){
        return price;
    }

    public void changePrice(BigDecimal newPrice){
        if(newPrice == null){
            throw new IllegalArgumentException("Fiyat boş olamaz.");
        }
        if(newPrice.compareTo(BigDecimal.ZERO)<0){
            throw new IllegalArgumentException("Fiyat negatif olamaz.");
        }

        this.price=newPrice;
    }
}
