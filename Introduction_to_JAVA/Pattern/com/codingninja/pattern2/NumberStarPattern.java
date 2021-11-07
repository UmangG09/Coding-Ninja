package com.codingninja.pattern2;

import java.util.Scanner;

public class NumberStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n)
		{
			int j=1;
			int p=n;
			while(j<=(n-i+1))
			{
				if(p==i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(p);
				}
	     		p--;
				j++;
			}
			
			int k=1;
			int r=i-1;
			
			while(k<=(i-1))
			{
				System.out.print(r);
				r--;
				k++;
			}
			System.out.println();
			i++;
					
		}

	}

}
