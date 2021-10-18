package com.while_loop;

import java.util.Scanner;

public class farhetieCel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int w=sc.nextInt();
        
        while(s<=e)
        {
            int cel=convertCelisus(s);
            System.out.println(s+"\t"+cel);
            s=s+w;
        }
       
	}
	
	public static int convertCelisus(int far)
    {
        int cel=(int)((5.0/9)*(far-32));
        return cel;
    }

}
