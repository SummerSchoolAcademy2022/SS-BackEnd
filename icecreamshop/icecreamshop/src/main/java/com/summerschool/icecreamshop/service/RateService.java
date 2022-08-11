package com.summerschool.icecreamshop.service;

import com.summerschool.icecreamshop.model.Product;
import com.summerschool.icecreamshop.model.Rate;
import com.summerschool.icecreamshop.repository.RateRepository;
import net.bytebuddy.utility.nullability.AlwaysNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class RateService {

    private final RateRepository rateRepository;

    public RateService(RateRepository rateRepository) {
        this.rateRepository = rateRepository;
    }

    public List<Rate> getAll() {
        return rateRepository.findAll();
    }

    public Rate save(Rate rate) {
        return rateRepository.save(rate);
    }

    public Optional<Rate> get(Long id) {
        return rateRepository.findById(id);
    }

    public Rate patch(Rate rate) {

        try {
            return rateRepository.save(rate);
        } catch (Exception e) {
            return null;
        }

    }

    public ResponseEntity<List<Rate>> getListOfRates(Long id) {
        List<Rate> rateListByProductId = new ArrayList<>();
        List<Rate> rateList = rateRepository.findAll();

        for (Rate rate : rateList) {
            Product product = rate.getProduct();
            Long productId = product.getId();
            if (Objects.equals(id, productId)) {
                rateListByProductId.add(rate);
            }
        }

        if (rateListByProductId.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, null);
        } else {
            return new ResponseEntity<>(rateListByProductId, HttpStatus.OK);
        }
    }


}
