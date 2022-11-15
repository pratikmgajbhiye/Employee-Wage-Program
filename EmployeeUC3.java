package com.BridgeLabz.EmployeeWageProgram;

import java.util.Random;
public class EmployeeUC3 {
	
	//Add Part time Employee & Wage
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO EMPLOYEE WAGE Program");
		Random random  = new Random();
		int WagePerHour = 20;
		int fullDayHour = 8;
		int HalfDayHour = 4;
		int Salary = 0;
		int randomNum = random.nextInt(2);
		
		if(randomNum==1) 
		{
			System.out.println("Employee is Present");
			Salary = WagePerHour * fullDayHour;
		}
		else if(randomNum==2) 
		{
			System.out.println("Employee is Working Half Day");
			Salary = WagePerHour * HalfDayHour;
		}
		else 
		{
		System.out.println("Employee is Absent");
		}
		System.out.println("Salary is: "+Salary);

	}

}
