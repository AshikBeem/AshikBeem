package org.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayClass8 {
	//Description : Add a value 50 in the 2nd index and display
	                                     //the list after adding.
    //Input : List = 10,20,30,90,10,10,40,50
	public static void main(String[] args) {
		
		List a=new ArrayList<>();
		a.add(10);a.add(20);a.add(30);a.add(90);a.add(10);a.add(10);a.add(40);a.add(50);
		System.out.println("qus 8.1: "+a);
		a.add(2,50);
		System.out.println("add value 50 in 2nd index: "+a);
		
		List b=new ArrayList<>();
		b.add(10);b.add(20);b.add(30);b.add(90);b.add(10);b.add(10);b.add(40);b.add(50);
		System.out.println("\nqus 8.2: "+b);
		List c=new ArrayList<>();
		c.add(70);
		b.addAll(c);
		System.out.println("add value 70 in last index: "+b);
		
		List d=new ArrayList<>();
		d.add(10);d.add(20);d.add(30);d.add(90);d.add(10);d.add(10);d.add(40);d.add(50);
		System.out.println("\nqus 8.3: "+d);
		d.add(8,80);
		System.out.println("add value 80 in 8th index: "+d);
		
		List li=new ArrayList<>();
		li.add(10);li.add(20);li.add(30);li.add(90);li.add(10);li.add(10);li.add(40);li.add(50);
		System.out.println("\nqus 8.1: "+li);
		List f=new ArrayList<>();
		f.add(10);f.add(20);f.add(30);f.add(90);f.add(10);f.add(10);f.add(10);f.add(40);f.add(50);
		int x=f.lastIndexOf(10);
		li.add(x, 100);
		System.out.println("add value 100 at the"
				+ "\n last index of 10: "+li);
		
		
		
		
		
		
		
		
	}
	
	

}
