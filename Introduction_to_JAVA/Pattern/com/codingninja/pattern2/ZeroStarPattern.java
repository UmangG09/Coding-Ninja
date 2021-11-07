package com.codingninja.pattern2;

import java.util.Scanner;

public class ZeroStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		
		
		while(i<=n)
		{
			int j=1;
		     while(j<=(i-1))
		     {
		    	 System.out.print(0);
		    	 j++;
		     }
		     System.out.print("*");
		     
		     int k=1;
		     while(k<=(n-i))
		     {
		    	 System.out.print(0);
		    	 k++;
		     }
		     System.out.print("*");
		     
		     int p=1;
		     while(p<=(n-i))
		     {
		    	 System.out.print(0);
		    	 p++;
		     }
		     
		     System.out.print("*");
		     int t=1;
		     while(t<=(i-1))
		     {
		    	 System.out.print(0);
		    	 t++;
		     }
		     System.out.println();
		     i++;
		     
		}
	}

}
