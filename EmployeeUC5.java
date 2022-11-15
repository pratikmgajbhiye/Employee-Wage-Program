package com.BridgeLabz.EmployeeWageProgram;

import java.util.Random;
public class EmployeeUC5 {

	//Calculating Wages for a Month
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO EMPLOYEE WAGE Program");
		Random random  = new Random();
		int WagePerHour = 20;
		int fullDayHour = 8;
		int HalfDayHour = 4;
		int Salary = 0;
		int monthlySalry = 0;
		int WorkingDaysPerMonth = 20;
		
		for (int i=1; i<=WorkingDaysPerMonth;i++) {
			
		int randomNum = random.nextInt(3);
		
		switch(randomNum)
		{
		case 0:
			System.out.println("Employee is Absent");
			break;
		case 1:
			System.out.println("Employee is Working Full Day: ");
			Salary = WagePerHour * fullDayHour;
			break;
		case 2:
			System.out.println("\"Employee is Working Half Day: ");
			Salary = WagePerHour * HalfDayHour;

		}
		monthlySalry = monthlySalry * HalfDayHour;
		System.out.println("Salary is: "+Salary);
	}
		System.out.println("Total Salary: "+monthlySalry);
	}

}
