package com.summerschool.icecreamshop.controller;


import com.summerschool.icecreamshop.dto.RateDTO;
import com.summerschool.icecreamshop.model.Product;
import com.summerschool.icecreamshop.model.Rate;
import com.summerschool.icecreamshop.service.ProductService;
import com.summerschool.icecreamshop.service.RateService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping(path = "/rates")
public class RateController {
    private final RateService rateService;
    private final ModelMapper modelMapper;

    @Autowired
    public RateController(RateService rateService,
                          ModelMapper modelMapper) {
        this.rateService = rateService;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public ResponseEntity saveRate(@Valid @RequestBody Rate rate) {
        Rate savedRate = rateService.save(rate);
        return ResponseEntity.ok(savedRate);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Rate>> get(@PathVariable Long id) {
        return rateService.getListOfRates(id);
    }

    @GetMapping
    public ResponseEntity<List<RateDTO>> getRate() {
        return ResponseEntity.ok(rateService.getAll()
                .stream()
                .map(rate -> modelMapper.map(rate, RateDTO.class))
                .collect(Collectors.toList()));
    }
}
