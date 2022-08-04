package com.summerschool.icecreamshop.repository;

import com.summerschool.icecreamshop.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer>
{
}
