package com.summerschool.icecreamshop.repository;


import com.summerschool.icecreamshop.model.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  BasketRepository
        extends JpaRepository<Basket, Long> {

    void update(Basket request);
}
