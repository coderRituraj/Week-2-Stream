package com.bhavna.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import com.bhavna.bean.Employee;

public class Operations {
	public void getEmployeeWithNameS(ArrayList<Employee> empLst) {
		List<Employee> result=empLst.stream().filter(s->s.getName().startsWith("S")).collect(Collectors.toList());
		System.out.println(result.size());
	}
	public void getEmployeesInHyderabad(ArrayList<Employee> empLst) {
		List<Employee> hydEmp=empLst.parallelStream().filter(s->s.getLocation().contentEquals("Hyderabad")).collect(Collectors.toList());
		System.out.println(hydEmp);
	}
	public void getEmpHashMap(ArrayList<Employee> empLst) {
		HashMap<String, ArrayList<String>> empMap=new HashMap<String, ArrayList<String>>();
		empLst.parallelStream().forEach(s->{
			if(empMap.containsKey(s.getLocation())) {
				empMap.get(s.getLocation()).add(s.getName());
			}else {
				empMap.put(s.getLocation(), new ArrayList<String>());
				empMap.get(s.getLocation()).add(s.getName());
			}
		});
		System.out.println(empMap);
	}
	
	public void getEmployeeWithSalaryOver100K(ArrayList<Employee> empLst) {
		empLst.parallelStream().forEach((s)->{
			if(s.getSalary()>100000) {
				System.out.println(s);
			}
		});
	}
	
	public List<Employee> sortEmployeeBasedOnNameLocation(ArrayList empLst){
		Comparator<Employee> comparingAttributes=Comparator.comparing(Employee::getName).thenComparing(Employee::getLocation);
		List<Employee> sortedEmployees=(List<Employee>) empLst.stream().sorted(comparingAttributes).collect(Collectors.toList());
		
		return sortedEmployees;
	}

}
