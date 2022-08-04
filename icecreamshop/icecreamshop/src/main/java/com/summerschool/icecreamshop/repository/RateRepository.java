package com.summerschool.icecreamshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RateRepository extends JpaRepository<Integer, RateRepository> {
}
