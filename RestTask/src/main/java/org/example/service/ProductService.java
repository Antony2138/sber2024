package org.example.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.repository.ProductRepository;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ProductService{
    @Autowired
    private ProductRepository productRepository;

    public long saveProduct(Product product){
        return productRepository.addProduct(product);
    }

    public Product searchProduct(long id){
        return productRepository.searchById(id);
    }
    public List<Product> searchProductByName(String name){
        return productRepository.searchByName(name);
    }

    public void deleteProduct(long id){
        productRepository.deleteProduct(id);
    }


}
