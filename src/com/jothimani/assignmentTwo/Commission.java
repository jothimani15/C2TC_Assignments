package com.jothimani.assignmentTwo;

import java.util.Scanner;

public class Commission {

	    // Data members
	    String name;
	    String address;
	    String phone;
	    double salesAmount;

	    // Method to accept details
	    void acceptDetails() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter name: ");
	        name = sc.nextLine();

	        System.out.print("Enter address: ");
	        address = sc.nextLine();

	        System.out.print("Enter phone number: ");
	        phone = sc.nextLine();

	        System.out.print("Enter sales amount: ");
	        salesAmount = sc.nextDouble();
	    }

	    // Method to calculate commission
	    void calculateCommission() {
	        double commission;

	        if (salesAmount >= 100000) {
	            commission = salesAmount * 0.10;
	        } else if (salesAmount >= 50000) {
	            commission = salesAmount * 0.05;
	        } else if (salesAmount >= 30000) {
	            commission = salesAmount * 0.03;
	        } else {
	            commission = 0;
	        }

	        System.out.println("Commission earned: ₹" + commission);
	    }
	}


