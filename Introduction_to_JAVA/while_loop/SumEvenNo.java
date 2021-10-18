package com.while_loop;

import java.util.Scanner;

public class SumEvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int start=1;
		int sum=0;
		
		while(start<=n)
		{
			if(start%2==0)
			{
				sum=sum+start;
			}
			start=start+1;
		}
		
		System.out.println(sum);

	}

}
