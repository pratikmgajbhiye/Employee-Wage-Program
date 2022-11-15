package com.BridgeLabz.EmployeeWageProgram;

import java.util.Random;
public class EmployeeUC6 {

	//Calculate Wages till a condition of total working hours or days is reached for a month
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
		int days = 1;
		int MonthlyHours =0;
		
		while (days!=20 && monthlySalry!=100) {
			days++;
		
		int randomNum = random.nextInt(3);
		
		switch(randomNum)
		{
		case 0:
			System.out.println("Employee is Absent");
			break;
		case 1:
			System.out.println("Employee is working Full Day: ");
			
			Salary = WagePerHour * fullDayHour;
			MonthlyHours = MonthlyHours * fullDayHour;
			break;
		case 2:
			System.out.println("\"Employee is Working Half Day: ");
			
			Salary = WagePerHour * HalfDayHour;
			MonthlyHours = MonthlyHours * HalfDayHour;
			
		}
		System.out.print("random: "+randomNum+"\t");
		monthlySalry = monthlySalry * HalfDayHour;
		System.out.println("Salary is: "+Salary);
		
		}
		System.out.println("Total Salary: "+monthlySalry);
	}

}
