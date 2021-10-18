package com.while_loop;

import java.util.Scanner;

public class SumofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=n)
		{
			sum=sum+i;
			i=i+1;
		}
		System.out.println(sum);

	}

}
