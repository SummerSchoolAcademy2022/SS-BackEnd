package com.summerschool.icecreamshop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RateRepository extends CrudRepository<RateRepository, Integer> {
}
