package org.example;

import org.example.controller.ihm;
import org.example.dao.ProductDao;
import org.example.entity.Product;
import org.example.service.ProductService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        ProductService productService = new ProductService();
//        Product product1 = Product.builder().brand("Brand 1").reference("Reference 1").date(LocalDate.now()).price(10).stock(100).build();
//        Product product2 = Product.builder().brand("Brand 2").reference("Reference 2").date(LocalDate.now()).price(20).stock(200).build();
//        Product product3 = Product.builder().brand("Brand 3").reference("Reference 3").date(LocalDate.now()).price(30).stock(300).build();
//        Product product4 = Product.builder().brand("Brand 4").reference("Reference 4").date(LocalDate.now()).price(40).stock(400).build();
//        Product product5 = Product.builder().brand("Brand 5").reference("Reference 5").date(LocalDate.now()).price(50).stock(500).build();
//
//        productDao.save(product1);
//        productDao.save(product2);
//        productDao.save(product3);
//        productDao.save(product4);
//        productDao.save(product5);


//
//        productService.save("brand 2", "reference 2", LocalDate.now(), 20, 200);
//        productService.save("brand 3", "reference 3", LocalDate.now(), 30, 300);
//        productService.save("brand 5554", "reference 4", LocalDate.now(), 40, 400);
//        productService.save("brand 5", "reference 5", LocalDate.now(), 50, 500);

//        productDao.get(2, Product.class);
//        productDao.delete(productDao.get(3, Product.class));

//        Product productFound = productDao.get(1, Product.class);
//        productFound.setBrand("samsung");
//        productDao.save(productFound);

//        Product productFound = productDao.get(2, Product.class);
//        productFound.setBrand("test");
//        productService.update(productFound);

//          productService.delete(7);
//          productService.delete(8);
//          productService.delete( 9);
//
//        productDao.getAllProductOverThePrice(30).forEach(System.out::println);
//        productDao.getAllProductBetween2Date(LocalDate.now().minusMonths(1),LocalDate.now()).forEach(System.out::println);
//        productDao.getAllProductBetween2Date(LocalDate.of(2022, 2, 15), LocalDate.of(2022, 2, 20)).forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);


//        System.out.println("entrer le stock minimum : ");
//        int stock = Integer.parseInt(scanner.nextLine());
//        productDao.getNumberAndReference(stock).forEach(System.out::println);
//
//        System.out.println("entrer la marque : ");
//        String brand = scanner.nextLine();
////        productDao.getAllProductByBrand(brand).forEach(System.out::println);
//        for (Product product : productDao.getAllProductByBrand(brand)) {
//            System.out.println(product.getStock());
//        }

        new ihm().start();








    }
}