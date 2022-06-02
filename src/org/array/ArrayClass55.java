package org.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayClass55 {
	public static void main(String[] args) {
		List c=new ArrayList<>(); //index value of 10 present in below list=10,20,30,90,10,10,40,50,10 
		c.add(10);c.add(20);c.add(30);c.add(90);c.add(10);c.add(10);c.add(40);c.add(50);c.add(10);
		System.out.println("\nqus5.5 ="+c);
		for(int i=0;i<c.size();i++) {
			Object ob=c.get(i);
			if(ob.equals(10)) {
				System.out.println("element 10 is present at:"+i);
			}	
			}
		System.out.println("\nqus5.6 ="+c);
		for(int j=0;j<c.size();j++) {
		Object ob = c.get(j);
			if(ob.equals(70)) {
				System.out.println("element 70 is present at:"+j);
			}	else
				System.out.println("element 70 is not present inex of="+j);
		}
		}
	}


