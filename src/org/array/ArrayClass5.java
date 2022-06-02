package org.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayClass5 {
	public static void main(String[] args) {
		List a=new ArrayList<>(); //List = 10,20,30,90
		a.add(10);a.add(20);a.add(30);a.add(90);
		System.out.println("qus5.1 :"+a);
		int index=a.indexOf(10);
		System.out.println("index of 10= "+index);
		
		List b= new ArrayList<>();//last index value of 10 List = 10,20,30,90,10,10,40,50
		b.add(10);b.add(20);b.add(30);b.add(90);b.add(10);b.add(10);b.add(40);b.add(50);
		System.out.println("\nqus5.2= "+b);
		int last=b.lastIndexOf(10);
		System.out.println("lastindex of 10= "+last);
		 
		System.out.println("\nqus5.3 ="+b);
		int index1=b.indexOf(50);
		System.out.println("index value of 50= "+index1);
		
		System.out.println("\nqus5.4 ="+b);
		int index2=b.indexOf(90);
		System.out.println("index value of 90= "+index2);
		 
		List c=new ArrayList<>(); //index value of 10 present in below list=10,20,30,90,10,10,40,50,10 
		c.add(10);c.add(20);c.add(30);c.add(90);c.add(10);c.add(10);c.add(40);c.add(50);c.add(10);
		System.out.println("\nqus5.5 ="+c);
		boolean present=c.contains(10);
		if(present==true) 
			System.out.println("index value of 10 is present");
		else 
			System.out.println("index value of 10 is not present");
		
		System.out.println("\nqus5.6 ="+c);
		boolean present1=c.contains(70);
		if(present1==true) 
			System.out.println("index value of 70 is present ");
		else 
			System.out.println("index value of 70 is not present ");
		
		
	}

}
