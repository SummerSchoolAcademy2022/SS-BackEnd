package com.summerschool.icecreamshop.repository;

import com.summerschool.icecreamshop.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>
{
}
