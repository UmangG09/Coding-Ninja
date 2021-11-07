package com.codingninja.pattern2;

import java.util.Scanner;

public class Parallelogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n)
		{
			int space=1;
			while(space<=i-1)
			{
				System.out.print(" ");
				space++;
			}
			
			int inc=1;
			
			while(inc<=n)
			{
				System.out.print("*");
				inc++;
			}
			
			
			System.out.println();
			
			i++;
		}

	}

}
