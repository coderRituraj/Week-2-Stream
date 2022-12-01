package com.bhavna.dao;

import java.util.ArrayList;

import com.bhavna.bean.Employee;

public class EmployeeData {
static ArrayList<Employee> employeeLst=new ArrayList<Employee>();
	
	public ArrayList<Employee> populateWithEmployee() {
		employeeLst.add(new Employee("Ashish",60000,"Delhi"));
		employeeLst.add(new Employee("Avinash",65000,"Noida"));
		employeeLst.add(new Employee("Kiran",70000,"Gurugram"));
		employeeLst.add(new Employee("John",75000,"Faridabad"));
		employeeLst.add(new Employee("Robbert",80000,"Chandigarh"));
		employeeLst.add(new Employee("Rohit",85000,"Hyderabad"));
		employeeLst.add(new Employee("Jack",90000,"Pune"));
		employeeLst.add(new Employee("Sahil",950000,"Noida"));
		employeeLst.add(new Employee("Akhtar",750000,"Hyderabad"));
		
		return employeeLst;
	}

}
