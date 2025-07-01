package org.example;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    public List<Product> productList = new ArrayList<>();

    public void addProduct(Product product){
        productList.add(product);
    }

    public List<Product> update(){
        for (Product product : productList){
            int quality = product.getQuality();
            int sellIn = product.getSellIn();

            sellIn = sellIn - 1;
            if (sellIn < 0) {
                sellIn = 0;
            }

            if (quality >= 50){
                quality = 50;
            } else if (quality <= 0){
                quality = 0;
            } else {

                if (product.getType().equals(Type.LAITIER)){
                    if (product.getName().equals("brie vieilli")){
                        quality = quality + 1;

                    } else if (sellIn == 0){
                        quality = quality - 4;
                    } else {
                        quality = quality - 2;

                    }
                } else if (sellIn == 0){
                    quality = quality - 2;

                } else {
                    quality = quality - 1;

                }
            }

            product.setSellIn(sellIn);
            product.setQuality(quality);
        }
        return productList;
    }
}