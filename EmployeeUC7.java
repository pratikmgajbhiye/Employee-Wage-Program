package com.BridgeLabz.EmployeeWageProgram;

import java.util.Random;
public class EmployeeUC7 {

	//Refactor the Code to write a Class Method to Compute Employee Wage

		// TODO Auto-generated method stub

		static int WagePerHour = 20;
		static int fullDayHour = 8;
		static int HalfDayHour = 4;
		static int Salary = 0;
		static int monthlySalry = 0;
		static int WorkingDaysPerMonth = 20;
		static int days = 0;
		static int MonthlyHours = 0;
		
		public static void ComputeEmpWage() {
			Random random = new Random();
			
			while (days!=20 && monthlySalry!=100) {
				days++;
			
			int randomNum = random.nextInt(3);
			
			switch(randomNum)
			{
			case 0:
				System.out.println("Employee is Absent");
				break;
			case 1:
				System.out.println("Employee is Working Full Day: ");
				
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
		
		public static void displayTotalSalary()
		{
		System.out.println("Total Salary: "+monthlySalry);
		}
		public static void main(String[] args)
		{
			EmployeeUC7 object = new EmployeeUC7();
			EmployeeUC7.ComputeEmpWage();
			object.displayTotalSalary();
		}

}
