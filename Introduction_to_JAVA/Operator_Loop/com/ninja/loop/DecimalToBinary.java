package com.ninja.loop;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int base=1;
		int decValue=0;
		while(num!=0)
		{
			int rem=num%10;
			decValue=decValue+rem*base;
			num=num/10;
			base=2*base;
		}
		System.out.println(decValue);

	}

}
