package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) 
	{
		Random random = new Random();
		int attendance = random.nextInt(3);
		
		int wagePerHr = 20;
		int fullDayHours = 8;
		int wagePerDay = 0;
		if(attendance==2)
		{
			System.out.println("Emp is Present");
			wagePerDay = wagePerHr * fullDayHours;
		}
		else
		{
		    System.out.println("Emp is absent....");	
		}
	}

}
