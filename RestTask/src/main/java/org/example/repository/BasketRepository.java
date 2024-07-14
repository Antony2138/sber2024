package org.example.repository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.model.Basket;
import org.example.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Repository
@NoArgsConstructor
public class BasketRepository {
    private List<Basket> basketList = new ArrayList<Basket>();
    private long id = -1;

    public void createBasket(){
        Basket basket = new Basket(id++, null, new ArrayList<Product>());
        basketList.add(basket);
    }

//    public List getBasketProductList(long id){
//       return basketList.stream().filter(x -> x.getId() == id).toList();
//    }
//// Запомнить чушку
    public void addProductInBasket(Product product, long idBasket){
        if (idBasket != id){
            createBasket();
        }
        basketList.get((int) idBasket).getProductList().add(product);
//        List<Product> help = getBasketProductList(idBasket);
//        help.add(product);
    }

    public void deleteProductFromBasket(long idBasket, long idProduct){
        basketList.get((int) idBasket).getProductList().removeIf(p -> p.getId() == id);
    }

}
