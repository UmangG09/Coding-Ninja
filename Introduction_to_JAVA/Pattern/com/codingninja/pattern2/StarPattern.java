package com.codingninja.pattern2;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n)
		{
			int space=1;
			while(space<=n-i)
			{
				System.out.print(" ");
				space++;
			}
			
			int inc=1;
			
			while(inc<=i)
			{
				System.out.print("*");
				inc++;
			}
			
			int dec=1;
			while(dec<=i-1)
			{
				System.out.print("*");
				dec++;
			}
			System.out.println();
			
			i++;
		}

	}

}
