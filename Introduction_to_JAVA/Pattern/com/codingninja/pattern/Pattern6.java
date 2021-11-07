package com.codingninja.pattern;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n)
		{
			int j=1;
			int startingno=i;
			while(j<=i)
			{
				System.out.print(startingno);
				startingno++;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
