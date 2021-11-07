package com.ninja.loop;

public class OutputLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while(i < 3) {
		    int j = 0;
		    while(j < 5) {
		        j++;
		        if(j == 3) {
		            continue;
		        }
		        System.out.print(j + " ");
		    }
		    i++;
		}
	}

}
