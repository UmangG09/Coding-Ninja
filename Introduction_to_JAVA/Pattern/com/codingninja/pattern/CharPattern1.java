package com.codingninja.pattern;

import java.util.Scanner;

public class CharPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n)
		{
			char startingno='A';
			int j=1;
			while(j<=n)
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
