package com.codingninja.pattern2;

import java.util.Scanner;

public class HalfDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n+1)
		{
			int inc=1;
			
			while(inc<=(2*i-1))
			{
				System.out.print("*");
				inc++;
			}
			
			
			System.out.println();
			
			i++;
		}
		
		int k=n;
		
		while(k>=1)
		{
		
			int inc=1;
			
			while(inc<=(2*k-1))
			{
				System.out.print("*");
				inc++;
			}
			
			
			System.out.println();
			
			k--;
		}

	}

}
