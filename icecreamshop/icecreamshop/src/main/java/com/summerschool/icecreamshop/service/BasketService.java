package com.summerschool.icecreamshop.service;

import com.summerschool.icecreamshop.exceptions.ResourceNotFoundException;
import com.summerschool.icecreamshop.model.Basket;
import com.summerschool.icecreamshop.repository.BasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BasketService {
    @Autowired
    BasketRepository basketRepository;

    public Basket createBasket(Basket basket) {
        if (basket.getId() == null) {
            basket = basketRepository.save(basket);
            return basket;
        } else {
            Optional<Basket> basketOptional = basketRepository.findById(basket.getId());

            if (basketOptional.isPresent()) {
                Basket newBasket = basketOptional.get();
                newBasket.setSessionId(basket.getSessionId());
                newBasket.setBasketProductList(basket.getBasketProductList());

                newBasket = basketRepository.save(newBasket);

                return newBasket;
            } else {
                throw new ResourceNotFoundException("No employee record exist for given id");
            }
        }
    }

    public List<Basket> findAll() {
        List<Basket> result = (List<Basket>) basketRepository.findAll();


        return result;
    }

    public void deleteById(Long id) {
        Optional<Basket> employee = basketRepository.findById(id);

        if (employee.isPresent()) {
            basketRepository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("Error 404 nu s-a gasit cos dupa id");
        }
    }

    void deleteAll() {
        basketRepository.deleteAll();
    }
}
