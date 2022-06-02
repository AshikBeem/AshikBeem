package org.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayClass6 {
	public static void main(String[] args) {
		
		List a=new ArrayList<>();//value present at 2nd index List = 10,20,30,40,50,60
		a.add(10);a.add(20);a.add(30);a.add(50);a.add(60);
		System.out.println("qus6.1= "+a);
		Object get=a.get(1);
		System.out.println("value present at 2nd index List= "+get);
		
		List b=new ArrayList<>();//value present at 4th index List = 100,200,300,400,500,600,700
		b.add(100);b.add(200);b.add(300);b.add(400);b.add(500);b.add(600);b.add(700);
		System.out.println("\nqus6.2= "+b);
		Object get1=b.get(3);
		System.out.println("value present at 4th index List= "+get1);
		
		List c=new ArrayList<>();//value present at 8th index List = 105,205,305,405,505,605,705,805
		c.add(105);c.add(205);c.add(305);c.add(405);c.add(505);c.add(605);c.add(705);c.add(805);
		System.out.println("\nqus6.3= "+c);
		Object get2=c.get(7);
		System.out.println("value present at 8th index List= "+get2);
		
		List<Integer> d=new ArrayList<Integer>();//List = 105,205,305,405,505,605,705,805
		d.add(105);d.add(205);d.add(305);d.add(405);d.add(505);d.add(605);d.add(705);d.add(805);
		System.out.println("\nqus6.4= "+d);
		System.out.println("normal for loop");
		for(int i=0;i<d.size();i++) {
			System.out.println(d.get(i));
		}
		System.out.println("\nqus6.5= "+d);
		System.out.println("enhanced for loop");
		for(int n : d) {
			System.out.println(n+" ");
		}
		
		
	}

}
