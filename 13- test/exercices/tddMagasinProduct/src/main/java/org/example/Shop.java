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

            if (product.getQuality() >= 50){
                product.setQuality(50);
                break;
            }
            if (product.getQuality() <= 0){
                product.setQuality(0);
                break;
            }
            if (product.getType().equals(Type.LAITIER)){
                if (product.getName().equals("brie vieilli")){
                    product.setQuality(product.getQuality()+1);
                    break;
                }
                product.setQuality(product.getQuality()-1);
            }

           if (product.getSellIn()==0){
               product.setQuality(product.getQuality()-2);
           }else {
               product.setQuality(product.getQuality()-1);
           }




            product.setSellIn(product.getSellIn() - 1);

        }
        return productList;
    }
}
