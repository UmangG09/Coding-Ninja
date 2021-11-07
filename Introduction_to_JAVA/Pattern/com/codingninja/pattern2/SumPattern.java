package com.codingninja.pattern2;

import java.util.Scanner;

public class SumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n)
		{
			int j=1;
			int p=1;
			int sum=0;
			while(j<=i)
			{
				
			     sum=sum+j;
					System.out.print(j);
					if(p<i)
					{
						System.out.print("+");
					}
					else
					{
						System.out.print("=");
						System.out.print(sum);
					}
					p++;
				
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
