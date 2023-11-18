package com.luv2code.springboot.thymeleafdemo.dao;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // JPARepository will create common CRUD methods for you

    // add a custom method to sort by last name to JPA Repository
    // Spring Data JPA will parse the method name. Looks for a specfic format and pattern
    // Create appropriate query ... behind the scenes
    public List<Employee> findAllByOrderByLastNameAsc();

}
