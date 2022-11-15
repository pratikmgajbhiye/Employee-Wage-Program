package com.BridgeLabz.EmployeeWageProgram;

import java.util.Random;
import java.util.*;
public class EmployeeUC8 {
	public static final int Half_Day_Hours = 4;
	public static final int Full_Day_Hours = 4;
	
	private final String companyName;
	private final int empWagePerHour;
	private final int workingHours;
	private final int workingDays;
	
	static Random random = new Random();
	public EmployeeUC8(String companyName, int empWagePerHour, int workingHours, int workingDays) {
		this.companyName = companyName;
		this.empWagePerHour = empWagePerHour;
		this.workingHours = workingHours;
		this.workingDays = workingDays;
	}
	
	public int calculateWage() {
		int salary = 0;
		int monthlySalary =0;
		int monthlyWorkingHours = 0;
		int days = 0;
		
		while (monthlyWorkingHours <= workingHours && days <= workingDays) {
			
			days++;
			
			int empCheck = random.nextInt(3);
			
			switch (empCheck) {
			case 1:
					System.out.println("Employee is working fullday");
					salary = empWagePerHour * Full_Day_Hours;
					monthlyWorkingHours = monthlyWorkingHours + Full_Day_Hours;
					break;
					
			case 2:
					System.out.println("Employee is working Halfday");
					salary = empWagePerHour * Half_Day_Hours;
					monthlyWorkingHours = monthlyWorkingHours + Half_Day_Hours;	
					break;
					
			default :
			        
			        System.out.println("Employee is Absent");
						
			}
			       monthlySalary = monthlySalary + salary;
			       System.out.println("Days"+ days + "Salary is: "+salary);
			       System.out.println("Monthly Salary: "+monthlySalary);
					
		    }
		
		
	              return monthlyWorkingHours * empWagePerHour;
	        }
				public static void main(String[] args) { 
				   
					EmployeeUC8 bajaj = new EmployeeUC8("Bajaj", 40,60,21);
					EmployeeUC8 tvs = new EmployeeUC8("Tvs", 40,60,21);
					EmployeeUC8 apple = new EmployeeUC8("Apple", 10,50,19);
				    
				    System.out.println("Total employee wage of Company: " +bajaj.companyName + ":"+bajaj.calculateWage());
				    System.out.println("Total employee wage of Company: " +tvs.companyName + ":"+tvs.calculateWage());
				    System.out.println("Total employee wage of Company: " +apple.companyName + ":"+apple.calculateWage());
	       }

	
	

}
