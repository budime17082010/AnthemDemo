package com.anthem.dao;

import org.springframework.data.repository.CrudRepository;

import com.anthem.pojo.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer >{

}
