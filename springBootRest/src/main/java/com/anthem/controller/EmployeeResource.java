package com.anthem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anthem.dao.EmployeeRepo;
import com.anthem.pojo.Employee;

@RestController
public class EmployeeResource {
	
	@Autowired
	EmployeeRepo empRepo;
	
	@RequestMapping("employees")
	public List<Employee> getEmployees(){
		
		List<Employee> emps = new ArrayList<Employee>();
		
		Employee e1= new Employee();
		e1.setEid(100);
		e1.setEname("Ashwin");
		e1.setLoc("Hyd");
		
		
		Employee e2= new Employee();
		e2.setEid(101);
		e2.setEname("Manju");
		e2.setLoc("Chennai");
		
		emps.add(e1);
		emps.add(e2);
		
		return emps;
	}

}
