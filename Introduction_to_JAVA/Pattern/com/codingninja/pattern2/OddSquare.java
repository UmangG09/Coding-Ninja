package com.codingninja.pattern2;

import java.util.Scanner;

public class OddSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n)
		{
			int j=1;
			int p=2*i-1;
			while(j<=(n-i+1))
			{
				System.out.print(p);
				p=p+2;
				j++;
			}
			
			int k=1;
			int r=1;
			
			while(k<=(i-1))
			{
				System.out.print(r);
				r=r+2;
				k++;
			}
			
			System.out.println();
			i++;
		}

	}

}
