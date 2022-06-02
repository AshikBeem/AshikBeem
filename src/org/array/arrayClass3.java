package org.array;

import java.util.ArrayList;
import java.util.List;

public class arrayClass3 {
	public static void main(String[] args) {
		//Description : Write a Java program to 
		                   //remove duplicates from array
        //Input  a[]= {10,10,20,50,60,80,60,50}
        //Output a[]= {10,20,50,60,80}
		List<Integer> a=new ArrayList<Integer>();
		a.add(10);a.add(10);a.add(20);a.add(50);a.add(60);a.add(80);
		a.add(60);a.add(50);
		System.out.println("qus: "+a);
		List<Integer> b=new ArrayList<Integer>();
		for(int data:a) {
			if(!b.contains(data)) {
				b.add(data);
			}
		}
		System.out.println("remove duplicate value= "+b);
		
		
		
		
	}

}
