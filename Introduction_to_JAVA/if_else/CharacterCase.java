package com.ifelse;

import java.util.Scanner;

public class CharacterCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		if(ch>=65 && ch<=91)
		{
			System.out.println(1);
		}
		else if(ch>=97 && ch<=123)
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(-1);
		}

	}

}
