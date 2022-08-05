package com.summerschool.icecreamshop.repository;

import com.summerschool.icecreamshop.model.Rate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RateRepository extends CrudRepository<Rate, Integer> {
}
