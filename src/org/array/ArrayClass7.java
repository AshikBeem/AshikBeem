package org.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayClass7 {
	public static void main(String[] args) {
		
		//Remove the value present at 2nd index
        ///Input:   List = 10,20,30,40,50,60
		List a=new ArrayList<>();
		a.add(10);a.add(20);a.add(30);a.add(40);a.add(50);a.add(60);
		System.out.println("qns7.1"+a);
		a.remove(2);
		System.out.println("remove the 2nd index value="+a);
		
		//Description : Remove the value present at 10th index 
        //Input:   List = 10,20,30,90,10,10,40
		List b=new ArrayList<>();
		b.add(10);b.add(20);b.add(30);b.add(90);b.add(10);b.add(10);b.add(40);
		System.out.println("\nnqns7.2"+b);
		int index=b.indexOf(10);
		b.remove(index);
		System.out.println("remove the 10 index value="+b);

		
		System.out.println("\nnqns7.3"+b);
		int index1=b.lastIndexOf(10);
		b.remove(index1);
		System.out.println("remove the last index 10 value="+b);
		
		
		
		
		
		
		
		
	
		
	}
	
}
