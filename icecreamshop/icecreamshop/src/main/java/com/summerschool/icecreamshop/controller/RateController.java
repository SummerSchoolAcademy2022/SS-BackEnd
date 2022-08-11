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
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


@RestController
@RequestMapping(path = "/rates")
public class RateController {
    private RateService rateService;
    private ProductService productService;

    private ModelMapper modelMapper;

    @Autowired
    public RateController(RateService rateService, ModelMapper modelMapper, ProductService productService) {
        this.rateService = rateService;
        this.modelMapper = modelMapper;
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<RateDTO> add(@RequestBody RateDTO rateDTO) {
        Rate rate = modelMapper.map(rateDTO, Rate.class);

        Rate savedRate = rateService.add(rate);
        if (savedRate == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new RateDTO());
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(modelMapper.map(savedRate, RateDTO.class));
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Rate>> get(@PathVariable Long id) {

        List<Rate> rateListByProductId = new ArrayList<>();
        List<Rate> rateList = rateService.getAll();

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


    @GetMapping
    public ResponseEntity<List<RateDTO>> getRate() {
        return ResponseEntity.ok(rateService.getAll()
                .stream()
                .map(rate -> modelMapper.map(rate, RateDTO.class))
                .collect(Collectors.toList()));
    }
}
