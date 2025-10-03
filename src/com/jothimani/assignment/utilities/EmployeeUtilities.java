package com.jothimani.assignment.utilities;

import com.jothimani.assignment.employees.Employee;

public class EmployeeUtilities {

	    /**
	     * Prints basic employee details.
	     */
	    public static void printEmployeeDetails(Employee emp) {
	        System.out.println("Name: " + emp.getName());
	        System.out.println("ID: " + emp.getEmployeeId());
	        System.out.println("Salary: " + emp.getSalary());
	    }

	    /**
	     * Gives a bonus to the employee.
	     */
	    public static void giveBonus(Employee emp, double bonus) {
	        double newSalary = emp.getSalary() + bonus;
	        emp.setSalary(newSalary);
	        System.out.println("New Salary after bonus: " + newSalary);
	    }
	}


