package org.example;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    public List<Product> productList = new ArrayList<>();

    public void addProduct(Product product){
        productList.add(product);
    }
    public List<Product> update(){
        return null;
    }
}
