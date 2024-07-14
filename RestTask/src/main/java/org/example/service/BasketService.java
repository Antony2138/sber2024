package org.example.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.repository.BasketRepository;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class BasketService {
    @Autowired
    private BasketRepository basketRepository;

    public void addProductInBasket(Product product, long id){
        basketRepository.addProductInBasket(product, id);
    }

    public void deleteProductFromBasket(long idBasket, long idProduct){
        basketRepository.deleteProductFromBasket(idBasket, idProduct);
    }
}
