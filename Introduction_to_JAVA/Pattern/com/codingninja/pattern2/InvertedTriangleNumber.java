package com.codingninja.pattern2;

import java.util.Scanner;

public class InvertedTriangleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n)
		{
			int j=1;
			while(j<=n-i+1)
			{
				System.out.print(n-i+1);
				j++;
			}
			
			j=1;
			while(j<=i-1)
			{
				System.out.print(" ");
				j++;
			}
			System.out.println();
			i++;
			
		}
	}

}
