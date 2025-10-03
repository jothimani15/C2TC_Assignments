package com.jothimani.assignment.employees;

public class Employee {
	
	    private String name;
	    private int employeeId;
	    private double salary;

	    // Constructor
	    public Employee(String name, int employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    // Getters
	    public String getName() {
	        return name;
	    }

	    public int getEmployeeId() {
	        return employeeId;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    // Setters
	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
	    
	    public void displayInfo() {
	    	System.out.println("Employee Name: " + name + ",ID: " + employeeId + ", salary: " + salary);
	    }
	}


