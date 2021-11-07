package com.codingninja.pattern;

import java.util.Scanner;

public class AlphaPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n)
		{
			char startingno=(char)('A'+i-1);
			int j=1;
			while(j<=i)
			{
				System.out.print(startingno);
				j++;
			}
			System.out.println();
			i++;
			
		}

	}

}
