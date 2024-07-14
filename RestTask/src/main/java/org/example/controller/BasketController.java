package org.example.controller;

import org.example.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.example.service.BasketService;

@RestController
@RequestMapping("Basket")
public class BasketController {
    @Autowired
    private BasketService basketService;
    @PostMapping("/add")
    public void addProductToBasket(@PathVariable Product product, @PathVariable long idBasket){
        basketService.addProductInBasket(product, idBasket);
    }

    @DeleteMapping("/delete")
    public void deleteProductFromBasket(@PathVariable long idBasket, @PathVariable long idProduct){
        basketService.deleteProductFromBasket(idBasket, idProduct);
    }
}
