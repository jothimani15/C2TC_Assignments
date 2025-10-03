package com.jothimani.assignment;

import com.jothimani.assignment.employees.Developer;
import com.jothimani.assignment.employees.Manager;
import com.jothimani.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {
	
	    public static void main(String[] args) {
	        Manager manager =new Manager("Jo",101,60000,"HR");
	        Developer developer =new Developer("Thiru",102,70000,"Java");
	        
	        EmployeeUtilities util = new EmployeeUtilities();
	        
	        util.printEmployeeDetails(manager);
	        util.printEmployeeDetails(developer);
	        
	        util.updateSalary(manager,80000);
	        util.updateSalary(developer,90000);
	        
	    }
	}


