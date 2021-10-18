package com.while_loop;

import java.util.Scanner;

public class PowerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int pow=sc.nextInt();
	    
		int start=1;
		int mul=no;
		int output=0;
		if(pow==0 && no>0)
		{
			output=1;
		}
		else if (no==0 && pow==0)
		{
			output=0;
		}
		else
		{
			while(start<pow)
			{
				no=no*mul;
				start=start+1;
			}
			output=no;
		}
		
		
		System.out.println(output);

	}

}
