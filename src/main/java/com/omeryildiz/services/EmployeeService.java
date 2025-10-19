package com.omeryildiz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omeryildiz.model.Employee;
import com.omeryildiz.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getallEmployeeList() {

		employeeRepository.getallEmployeelList();
		return null;
	}
}
