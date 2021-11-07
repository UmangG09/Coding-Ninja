package com.ninja.loop;

import java.util.Scanner;

public class TermOfAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=1;
		int input=1;
		while(count<=n)
		{
			int result=(3*input)+2;
			if(result%4!=0)
			{
				System.out.print(result+" ");
				count++;
			}
			input++;
			
		}
		

	}

}
