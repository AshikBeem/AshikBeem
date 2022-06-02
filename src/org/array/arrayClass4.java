package org.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class arrayClass4 {
	public static void main(String[] args) {

		List l= new ArrayList<>();
		l.add(10);l.add(20);l.add(30);l.add(90);l.add(10);l.add(10);l.add(40);l.add(50);
		int size=l.size();
		System.out.println("length of arraylist= "+size);
		
		List l1= new LinkedList<>();
		l1.add(100);l1.add(200);l1.add(300);l1.add(400);l1.add(500);l1.add(600);l1.add(700);
		int size1=l1.size();
		System.out.println("length of linkedlist= "+size1);
		
		List l2= new Vector<>();
		l2.add(105);l2.add(205);l2.add(305);l2.add(405);l2.add(505);l2.add(605);l2.add(705);
		int size2=l2.size();
		System.out.println("length of vectorlist= "+size2);
		
		List l3= new LinkedList<>();
		l3.add(100);l3.add(200);l3.add(300);l3.add(400);l3.add(500);l3.add(600);l3.add(700);
		int size3=l3.size();
		System.out.println("size of linkedlist="+size3);
	}

}
