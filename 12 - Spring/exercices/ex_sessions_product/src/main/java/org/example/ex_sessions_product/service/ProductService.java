package org.example.ex_sessions_product.service;

import org.example.ex_sessions_product.dto.ProductReceiveDto;
import org.example.ex_sessions_product.dto.ProductResponseDto;
import org.example.ex_sessions_product.entity.Product;
import org.example.ex_sessions_product.execption.NotFoundException;
import org.example.ex_sessions_product.repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public ProductResponseDto create (ProductReceiveDto product) {
        return productRepo.save(product.dtoToEntity()).entityToDto();
    }

    public ProductResponseDto update (long id, ProductReceiveDto product) {
        Product productToUpdate = productRepo.findById(id).orElseThrow(NotFoundException::new);
        Product productFromDto = product.dtoToEntity();
        productToUpdate.setName(productFromDto.getName());
        productToUpdate.setPrice(productFromDto.getPrice());
        return productRepo.save(productToUpdate).entityToDto();
    }

    public void delete (long id) {
        productRepo.deleteById(id);
    }

    public ProductResponseDto get (long id) {
        return productRepo.findById(id).orElseThrow(NotFoundException::new).entityToDto();
    }

    public List<ProductResponseDto> get(){
        return productRepo.findAll().stream().map(Product::entityToDto).toList();
    }
}
