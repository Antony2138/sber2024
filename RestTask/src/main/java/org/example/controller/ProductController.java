package org.example.controller;

import org.example.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.example.service.ProductService;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<String> productCreate(@RequestBody Product product) throws URISyntaxException {
        return ResponseEntity.created(new URI("http://localhost:8080/product/" + productService.saveProduct(product))).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> productGet(@PathVariable long id){
        Optional<Product> product = Optional.ofNullable(productService.searchProduct(id));
        return product.isPresent()
                ? ResponseEntity.ok().body(product.get())
                : ResponseEntity.notFound().build();
    }


    @GetMapping("/filter/{name}")
    public ResponseEntity<List<Product>> productGetByName(@PathVariable String name){
        List<Product> product = productService.searchProductByName(name);
        return !product.isEmpty()
                ? ResponseEntity.ok().body(product)
                : ResponseEntity.notFound().build();
    }


    @DeleteMapping("/{id}")
    public void productDelete(@PathVariable long id){
        productService.deleteProduct(id);
    }

}
