package com.ninja.loop;

import java.util.Scanner;

public class PrintPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    for(int i=1;i<=n;i++)
	    {
	    	if(checkPrime(i))
	    	{
	    		System.out.println(i);
	    	}
	    }
		
		

	}
	
	public static boolean checkPrime(int num)
	{
	   
	   int d=2;
	   if(num==1)
	   {
		   return false;
	   }
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
