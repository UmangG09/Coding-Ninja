package com.ninja.loop;

import java.util.Scanner;

public class IncreaseDecrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int totalNo=sc.nextInt();
		
		int prev=sc.nextInt();
		int i=1;
		boolean isDecrease=true;
		
		while(i<=(totalNo-1))
		{
		  int curr=sc.nextInt();
		  if(curr<prev)
		  {
			  if(isDecrease==false)
			  {
				  System.out.println(false);
				  return;
			  }
		  }
		  else if(curr>prev)
		  {
			  if(isDecrease==true)
			  {
				  isDecrease=false;
			  }
		  }
		  else if(curr==prev) {
			  System.out.println(false);
			  return;
		
		  }
		  
		  i++;
		  prev=curr;
		  
		}
		
		System.out.println(true);

	}

}
