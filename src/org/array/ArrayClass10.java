package org.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayClass10 {
	public static void main(String[] args) {
	/*Create a new ArrayListlists with values and return the common values
            Input : List = 10,20,30,90,10,10,40,50
            Input : List = 30,40,50,60,80*/
		List a=new ArrayList<>();
		a.add(10);a.add(20);a.add(30);a.add(90);
		a.add(10);a.add(10);a.add(40);a.add(50);
		System.out.println("list 1:"+a);
		List a1=new ArrayList<>();
		a1.add(30);a1.add(40);a1.add(50);a1.add(60);a1.add(80);
		System.out.println("list 2:"+a1);
		a.retainAll(a1);
		System.out.println("return the common values"
				+ "\nof list 1 and list 2: " +a);
		
		/*Create a new ArrayListlists with values and return the common values
              Input : List = 10,20,30,90,10,10,40,50
              Input : List = 10,20,60,50,40,70,80,90*/
		List b=new ArrayList<>();
		b.add(10);b.add(20);b.add(30);b.add(90);
		b.add(10);b.add(10);b.add(40);b.add(50);
		System.out.println("\nlist 1:"+b);
		List b1=new ArrayList<>();
		b1.add(10);b1.add(20);b1.add(60);b1.add(50);
		b1.add(40);b1.add(70);b1.add(80);b1.add(90);
		System.out.println("list 2:"+b1);
		b.retainAll(b1);
		System.out.println("return the common values"
				+ "\nof list 1 and list 2: " +b);
		
		/*Create a new ArrayListlists with values and return the common values
              Input : List = 10,20,30,40,50,60,70,80
              Input : List = 100,200,300,400,500,600,700,8000*/
		List c=new ArrayList<>();
		c.add(10);c.add(20);c.add(30);c.add(40);
		c.add(50);c.add(60);c.add(70);c.add(80);
		System.out.println("\nlist 1:"+c);
		List c1=new ArrayList<>();
		c1.add(100);c1.add(200);c1.add(300);c1.add(400);
		c1.add(500);c1.add(600);c1.add(700);c1.add(8000);
		System.out.println("list 2:"+c1);
		c.retainAll(c1);
		System.out.println("return the common values"
				+ "\nof list 1 and list 2: " +c);
	
	
	}
}
