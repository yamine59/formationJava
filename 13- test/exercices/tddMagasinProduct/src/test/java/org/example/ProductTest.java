package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ProductTest {
    private Product product;
    private Shop shop;

    @BeforeEach
    public void setup(){
        List<Product> productListTest = new ArrayList<>();
        shop = new Shop();
        shop.productList = productListTest;
    }

    @Test
    public void whenQualityDecrement_QualifyAndSellIn_10_5_ThenQualifyAndSellInIS_9_4 () {

        product = Product.builder().name("burger").type(Type.FOOD).quality(20).sellIn(5).build();
        shop.addProduct(product);
        List<Product> result = shop.update();
        int productQuality = result.getFirst().getQuality();
        int productSellIn = result.getFirst().getSellIn();
        Assertions.assertEquals(19,productQuality);
        Assertions.assertEquals(4,productSellIn);

    }

    @Test
    public void whenQualityIsNever_lowerTo0_quality0_ThenQualityIs0 (){
        product = Product.builder().name("burger").type(Type.FOOD).quality(0).sellIn(5).build();
        shop.addProduct(product);
        List<Product> result = shop.update();
        int productQuality = result.getFirst().getQuality();
        Assertions.assertEquals(0,productQuality);

    }

    @Test
    public void whenQualityIsNever_superiorTo50_quality90_ThenQualityIs50 (){
        product = Product.builder().name("burger").type(Type.FOOD).quality(90).sellIn(5).build();
        shop.addProduct(product);
        List<Product> result = shop.update();
        int productQuality = result.getFirst().getQuality();
        Assertions.assertEquals(50,productQuality);

    }

    @Test
    public void WhenSellInIs0_Quality20_ThenQualityIs18(){
        product = Product.builder().name("burger").type(Type.FOOD).quality(20).sellIn(0).build();
        shop.addProduct(product);
        List<Product> result = shop.update();
        int productQuality = result.getFirst().getQuality();
        Assertions.assertEquals(18,productQuality);
    }

    @Test
    public void WhenProductTypeLaitier_Quality20_ThenQualityIs18(){
        product = Product.builder().name("fromage").type(Type.LAITIER).quality(20).sellIn(5).build();
        shop.addProduct(product);
        List<Product> result = shop.update();
        int productQuality = result.getFirst().getQuality();
        Assertions.assertEquals(18,productQuality);
    }

    @Test
    public void WhenProductISBrieVieilli_quanlity15_ThenQualityIs16(){
        product = Product.builder().name("brie vieilli").type(Type.LAITIER).quality(15).sellIn(0).build();
        shop.addProduct(product);
        List<Product> result = shop.update();
        int productQuality = result.getFirst().getQuality();
        Assertions.assertEquals(16,productQuality);
    }

}
