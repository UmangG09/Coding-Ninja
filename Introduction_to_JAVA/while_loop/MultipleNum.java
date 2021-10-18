package com.while_loop;

import java.util.Scanner;

public class MultipleNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
		int start=1;
		while(start<=10)
		{
			
			System.out.println(start*no);
			start=start+1;
		}
		
		

	}

}
