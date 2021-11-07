package com.ninja.loop;

import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int choice=sc.nextInt();
		
		if(choice==1)
		{
			System.out.println(((n/2)*(n+1)));
		}
		else if(choice==2)
		{
			System.out.println(printProduct(n));
		}
		else
		{
			System.out.println(-1);
		}

	}
	
	public static int printProduct(int num)
	{
		int prod=1;
		int i=1;
		while(i<=num)
		{
			prod=prod*i;
			i++;
		}
		return prod;
	}

}
