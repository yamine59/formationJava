package org.example;

import java.util.ArrayList;
import java.util.List;

public class Command {

    private String from;
    private String to;
        private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
