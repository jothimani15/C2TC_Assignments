package com.jothimani.assignment.employees;

public class Developer extends Employee {
	
	    private String programmingLanguage;

	    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
	        super(name, employeeId, salary);
	        this.programmingLanguage = programmingLanguage;
	    }

	    public String getProgrammingLanguage() {
	        return programmingLanguage;
	    }

	    public void setProgrammingLanguage(String programmingLanguage) {
	        this.programmingLanguage = programmingLanguage;
	    }
	    
	    // override displayInfo
	    @override
	    public void displayInfo() {
	    	super.displayInfo();
	    	System.out.println("Programming Language: " + programmingLanguage);
	    }
	}


