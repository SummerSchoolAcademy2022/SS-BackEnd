package com.summerschool.icecreamshop.service;

import com.summerschool.icecreamshop.model.Rate;
import com.summerschool.icecreamshop.repository.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RateService {

    private final RateRepository rateRepository;

    @Autowired
    public RateService(RateRepository rateRepository) {
        this.rateRepository = rateRepository;
    }

    public List<Rate> getAll() {
        return rateRepository.findAll();
    }

    public Rate add(Rate rate) {
        try {
            return rateRepository.save(rate);
        } catch (Exception e) {
            return null;
        }
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

}
