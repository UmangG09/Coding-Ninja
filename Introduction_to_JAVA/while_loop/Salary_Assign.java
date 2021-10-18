package com.while_loop;

import java.util.Scanner;

public class Salary_Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int basic=sc.nextInt();
		
		char grade=sc.next().charAt(0);
		System.out.println(calculateSalary(basic,grade));
		
		

	}
	
	public static long calculateSalary(int basic,char grade)
	{
		double hra=(basic*.20);
		
		double da=(basic*.50);
		double pf=(basic*.11);
        double allow=calcAllow(grade);
  
        
        return Math.round(hra+da+allow+basic-pf);
		
	}
	
	public static int calcAllow(char grade)
	{
		
		if(grade=='A')
		{

			return 1700;
		}
		else if(grade=='B')
		{
	
			return 1500;
		}
		else 
		{
	
			return 1300;
		}
	}

}
