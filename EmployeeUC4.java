package com.BridgeLabz.EmployeeWageProgram;

import java.util.Random;
public class EmployeeUC4 {
	
	//Solving using Switch Case Statement
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO EMPLOYEE WAGE Program");
		Random random  = new Random();
		int WagePerHour = 20;
		int fullDayHour = 8;
		int HalfDayHour = 4;
		int Salary = 0;
		int randomNum = random.nextInt(3);
		
		switch(randomNum)
		{
		case 0:
			System.out.println("Employee is Absent");
			break;
		case 1:
			System.out.println("Employee is working fullday: ");
			Salary = WagePerHour * fullDayHour;
			break;
		case 2:
			System.out.println("\"Employee is working Halfday: ");
			Salary = WagePerHour * HalfDayHour;

		}
		System.out.println("Salary is: "+Salary);
	}

}
