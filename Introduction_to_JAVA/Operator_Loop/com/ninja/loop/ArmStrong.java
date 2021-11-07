package com.ninja.loop;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int temp1=num;
		int noDigit=0;
		double sum=0;
		while(num!=0)
		{
			num=num/10;
			noDigit=noDigit+1;
			
		}
		
		while(temp!=0)
		{
			int rem=temp%10;
			sum=sum+Math.pow(rem,noDigit);
			temp=temp/10;
			
		}
		if(temp1==(int)sum)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		

	}

}
