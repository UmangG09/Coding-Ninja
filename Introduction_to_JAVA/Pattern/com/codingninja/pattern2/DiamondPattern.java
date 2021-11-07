package com.codingninja.pattern2;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n/2+1)
		{
			int space=1;
			while(space<=(n/2+1-i))
			{
				System.out.print(" ");
				space++;
			}
			
			int inc=1;
			
			while(inc<=(2*i-1))
			{
				System.out.print("*");
				inc++;
			}
			
			
			System.out.println();
			
			i++;
		}
		
		int k=n/2;
		while(k>=1)
		{
			int space=1;
			while(space<=(n/2-k+1))
			{
				System.out.print(" ");
				space++;
			}
			
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
