package com.codingninja.pattern2;

import java.util.Scanner;

public class TraingelNumbers {

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
			
			int inc=i;
			
			while(inc<=(2*i-1))
			{
				System.out.print(inc);
				inc++;
			}
			
			int dec=(2*i-2);
			while(dec>=i)
			{
				System.out.print(dec);
				dec--;
			}
			System.out.println();
			
			i++;
		}

	}

}
