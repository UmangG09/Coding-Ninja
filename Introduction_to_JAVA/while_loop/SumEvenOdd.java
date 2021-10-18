package com.while_loop;

import java.util.Scanner;

public class SumEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int sumeven=0;
		int sumodd=0;
		
		while(no!=0)
		{
			int digit=no%10;
			if(digit%2==0)
			{
				sumeven=sumeven+digit;
			}
			else
			{
				sumodd=sumodd+digit;
			}
			no=no/10;
		}
		System.out.println(sumeven+" "+ sumodd);

	}

}
