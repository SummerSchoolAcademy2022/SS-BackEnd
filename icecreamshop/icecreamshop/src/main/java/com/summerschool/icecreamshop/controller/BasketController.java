package com.summerschool.icecreamshop.controller;


import com.summerschool.icecreamshop.model.Basket;
import com.summerschool.icecreamshop.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.ValidationException;

@RestController
@RequestMapping("/baskets")
public class BasketController {

    @Autowired
    BasketService basketService;
    @PostMapping()
    public ResponseEntity <?> create(@RequestBody Basket basket ) {
        try {
            basket= basketService.createBasket(basket);
        }catch(Exception e){ return ResponseEntity.badRequest().body("Can't create the basket");
    }
    return ResponseEntity.status(HttpStatus.CREATED).body(basket);}
    @PatchMapping("/baskets/{basketId}")
    public ResponseEntity<Basket> update(@RequestBody Basket basket, @PathVariable Long basketId) {

        try {
                return new ResponseEntity<> (basketService.update(basket, basketId), HttpStatus.OK);
            } catch (Exception exception) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @GetMapping("/baskets/{basketId}")
    public ResponseEntity <Basket> readById(@PathVariable Long basketId) {
        try {
            return new ResponseEntity<> (basketService.findById( basketId), HttpStatus.OK);
        } catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }


    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ValidationException.class)
    String exceptionHandler(ValidationException e) {
        return e.getMessage();
    }
}
