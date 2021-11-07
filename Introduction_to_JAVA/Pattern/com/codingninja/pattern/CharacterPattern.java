package com.codingninja.pattern;

import java.util.Scanner;

public class CharacterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n)
		{
			char startingChar=(char)('A'+n-i);
			int j=1;
			while(j<=i)
			{
				System.out.print(startingChar);
				startingChar++;
				j++;
			}
			System.out.println();
			i++;
			
		}

	}

}
