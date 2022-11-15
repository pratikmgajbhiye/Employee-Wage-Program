package com.BridgeLabz.EmployeeWageProgram;

import java.util.Random;
public class EmployeeUC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO EMPLOYEE WAGE Program");
		Random random  = new Random();
		int randomNUm = random.nextInt(2);
		
		if(randomNUm==1)
		{
			System.out.println("Employee is Present");
		}
		else
		{
		System.out.println("Employee is Absent");
		}
	}

}
