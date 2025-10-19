package com.omeryildiz.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.omeryildiz.model.Employee;

@Configuration
public class AppConfig {
	@Bean
	public List<Employee> employeeList() {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("1", "Omer", "Yildiz"));
		employeeList.add(new Employee("2", "Kerem", "Akbulut"));
		employeeList.add(new Employee("3", "Yakup", "Recber"));
		employeeList.add(new Employee("4", "William", "Afton"));
		employeeList.add(new Employee("5", "Arthur", "Morgan"));
		return employeeList;
	}

}
