package com.summerschool.icecreamshop.controller;


import com.summerschool.icecreamshop.model.Basket;
import com.summerschool.icecreamshop.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.ValidationException;

@RestController
public class BasketController {

    @Autowired
    BasketService basketService;
    @PostMapping("/baskets")
    public ResponseEntity <?> create(@RequestBody Basket basket ) {
        try {
            basket= basketService.createBasket(basket);
        }catch(Exception e){ return ResponseEntity.badRequest().body("Can't create the basket");
    }
    return ResponseEntity.status(HttpStatus.CREATED).body(basket);}

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ValidationException.class)
    String exceptionHandler(ValidationException e) {
        return e.getMessage();
    }
}
