package com.BridgeLabz.EmployeeWageProgram;

import java.util.Random;
import java.util.*;
public class EmployeeUC9 {
	public static final int Half_Day_Hours = 4;
	public static final int Full_Day_Hours = 4;
	
	private final String companyName;
	private final int empWagePerHour;
	private final int workingHours;
	private final int workingDays;
	int totalSalary;
	
	static Random random = new Random();
	
	public EmployeeUC9(String companyName, int empWagePerHour, int workingHours, int workingDays) {
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
			       System.out.print("Working Hours: "+monthlyWorkingHours+"\t");
			       System.out.println("Monthly Salary: "+monthlySalary);
					
		    }
		
		
	              return monthlyWorkingHours * empWagePerHour;
	        }
				public String toString() {
		return "Total Wage for Company: "+companyName+" is "+totalSalary;
				}
	
				public static void main(String[] args) { 
				   
					EmployeeUC9 bajaj = new EmployeeUC9("Bajaj", 40,60,21);
					EmployeeUC9 tvs = new EmployeeUC9("Tvs", 40,60,21);
					EmployeeUC9 apple = new EmployeeUC9("Apple", 10,50,19);
				    
					bajaj.calculateWage();
					tvs.calculateWage();
					apple.calculateWage();
					
					 System.out.println(bajaj);
					 System.out.println(tvs);
					 System.out.println(apple);
	       }

	
	

}
