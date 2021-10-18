package com.while_loop;

import java.util.Scanner;

public class PrintPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int start=2;
		
		while(start<=n)
		{
			if(checkPrime(start))
			{
				System.out.println(start);
			}
			start=start+1;
		}
	}
	
public static boolean checkPrime(int num)
	{
		int d=2;
		
		while(d<=num-1)
		{
			if(num%d==0)
			{
				return false;
			}
			d=d+1;
		}
		return true;
	}

}
