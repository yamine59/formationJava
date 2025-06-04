package org.example.service;

import org.example.dao.CommentDao;
import org.example.dao.ImageDao;
import org.example.dao.ProductDao;
import org.example.entity.Comment;
import org.example.entity.Image;
import org.example.entity.Product;

import java.time.LocalDate;
import java.util.List;

public class ProductService {
    ProductDao productDao = new ProductDao();
    ImageDao imageDao = new ImageDao();
    CommentDao commentDao = new CommentDao();
    public Product save(String brand, String reference, LocalDate purchaseDate, double price, int stock) {
        Product product = Product.builder().brand(brand).reference(reference).purchasedate(purchaseDate).price(price).stock(stock).build();
        return productDao.save(product);
    }

    public void update(Product product) {
        productDao.save(product);
    }

    public Product get(int id) {
        return productDao.get(id);

    }

    public List<Product> getAll() {
        return productDao.get();
    }

    public void delete(int id) {
        productDao.delete(id);
    }

    public void addImageToProduct(int idProduct,String url) {
        Image image = Image.builder().url(url).build();
        Product product = productDao.get(idProduct);
        image.setProduct(product);
        imageDao.save(image);

    }

    public void addCommentToProduct(int idProduct,String content,LocalDate date,int note) {
        Comment comment = Comment.builder().content(content).date(date).note(note).build();
        Product product = productDao.get(idProduct);
        comment.setProduct(product);
        commentDao.save(comment);

    }


    public List<Product> getAllProductByBrand (String brand){
        return productDao.getAllProductByBrand(brand);
    }

    public List<Product> getAllProductOverThePrice (double price){
        return productDao.getAllProductOverThePrice(price);
    }

    public List<Product> getAllProductBetween2Date(LocalDate start , LocalDate end){
        return productDao.getAllProductBetween2Date(start , end);
    }

    public List<Product> getIdAndRefByStock (int stock){
        return productDao.getIdAndRefByStock(stock);
    }

    public List<Product> avgPrice(){
        return productDao.avgPrice();
    }

    public void deleteProductByBrand(String brand){
        productDao.deleteProductByBrand(brand);
    }
}
