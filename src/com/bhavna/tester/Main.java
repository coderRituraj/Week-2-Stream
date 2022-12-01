package com.bhavna.tester;

import java.util.ArrayList;

import com.bhavna.bean.Employee;
import com.bhavna.dao.EmployeeData;
import com.bhavna.service.Operations;

public class Main {

	public static void main(String[] args) {
		EmployeeData empDataObj=new EmployeeData();
		ArrayList<Employee> empLst=empDataObj.populateWithEmployee();
		Operations optn=new Operations();
		System.out.println("Total number of employees whose name starts with 'S': ");
		optn.getEmployeeWithNameS(empLst);
		System.out.println("\nEmployees whose location is hyderabad: ");
		optn.getEmployeesInHyderabad(empLst);
		System.out.println("\nEmployee's with their location: ");
		optn.getEmpHashMap(empLst);
		System.out.println("\nEmployees with salary greater than 100000: ");
		optn.getEmployeeWithSalaryOver100K(empLst);
		System.out.println("\nSorted Employee data: ");
		System.out.println(optn.sortEmployeeBasedOnNameLocation(empLst));

	}

}
