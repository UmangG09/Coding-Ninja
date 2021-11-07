package com.ninja.loop;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int base=1;
		long binValue=0;
		while(num>0)
		{
			int rem=num%2;
			binValue=binValue+rem*base;
			num=num/2;
			base=10*base;
		}
		System.out.println(binValue);

	}

}
