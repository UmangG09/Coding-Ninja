package com.codingninja.pattern2;

import java.util.Scanner;

public class HalfDiamondNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n+1)
		{
			int inc=1;
			System.out.print("*");
			
			while(inc<=(i-1))
			{
				System.out.print(inc);
				inc++;
			}
			
			int dec=i-2;
			while(dec>=1)
			{
				System.out.print(dec);
				dec--;
			}
			
			if(i!=1)
			{
				System.out.print("*");
			}
			System.out.println();
			
			i++;
		}
		
     int k=n+1;
		
		while(k>=1)
		{
		
			int inc=1;
			System.out.print("*");
			
			while(inc<=(k-1))
			{
				System.out.print(inc);
				inc++;
			}
			
			int dec=k-2;
			while(dec>=1)
			{
				System.out.print(dec);
				dec--;
			}
			
			if(k!=1)
			{
				System.out.print("*");
			}
			System.out.println();
			
			k--;
		}
		
		

	}

}
