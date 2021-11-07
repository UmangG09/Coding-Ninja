package com.ninja.loop;

import java.util.Scanner;

public class FibonnaciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a=1;
		int b=1;
		int sum=a+b;
		int pos=3;
		while(pos<=n)
		{
		 a=b;
		 b=sum;
		 sum=a+b;
		 pos++;	
		}
		System.out.println(b);

	}

}
