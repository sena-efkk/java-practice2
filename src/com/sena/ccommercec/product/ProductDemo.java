package com.sena.ccommercec.product;

import java.math.BigDecimal;
import java.util.*;

public class ProductDemo {
    public static void main(String[] args) {
        List<Product> products =new ArrayList<>();

        products.add(new Product(1L , "Klavye ", new BigDecimal("1200")));
        products.add(new Product(2L ,"Mouse",new BigDecimal("450")));
        products.add(new Product(3L ,"Monitör", new BigDecimal("5000")));
        products.add(new Product(4L ,"Mouse Pad", new BigDecimal("250")));

        System.out.println("Tüm ürünler: ");
        for (Product p : products) {
            System.out.println(p.getName()+" - "+p.getPrice());
        }

        System.out.println("Fiyata göre artmalı: ");
        products.sort(Comparator.comparing(Product::getPrice));
        for (Product product : products) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }

        Set<Long> productIds =new HashSet<>();
        for ( Product p :products){
            productIds.add(p.getId());
        }

        System.out.println("Tekrarsız ürün ID sayısı: "+productIds.size());

        Map<Long,Product> productMap =new HashMap<>();
        for (Product p: products){
            productMap.put(p.getId(),p);
        }


        Product foundProduct = productMap.get(2L);
        if(foundProduct!=null){
            System.out.println("Bulunan ürün: " + foundProduct.getName());
        }else {
            System.out.println("Ürün bulunamadı.");
        }


    }
}
