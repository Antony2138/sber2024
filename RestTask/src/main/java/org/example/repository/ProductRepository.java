package org.example.repository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
@NoArgsConstructor
public class ProductRepository {
    private List<Product> productList = new ArrayList<Product>();
    private long id = -1;

    public long addProduct(Product product){
        id++;
        product.setId(id);
        productList.add(product);
        return product.getId();
    }

    public Product searchById(long id){
        return productList.stream().filter(x -> x.getId() == id).findAny().orElse(null);
    }

    public List<Product> searchByName(String name){
        return productList.stream().filter(x -> x.getName() == name).toList();
    }

    public void deleteProduct(long id){
        productList.removeIf(x -> x.getId() == id);
    }
}
