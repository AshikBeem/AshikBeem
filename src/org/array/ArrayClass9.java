package org.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayClass9 {
public static void main(String[] args) {
	
	//Replace the value 300 into 350 in the list
    //Input : List = 100,200,300,400,500,600,700
	List a=new ArrayList<>();
	a.add(100);a.add(200);a.add(300);a.add(400);a.add(500);a.add(600);a.add(700);
	System.out.println("qus9.1: "+a);
	List b=new ArrayList<>();
	b.add(100);b.add(200);b.add(300);b.add(400);b.add(500);b.add(600);b.add(700);
    int ind=b.indexOf(300);
    a.remove(ind);
    a.add(ind,305);
    System.out.println("replace value 300 into 305="+a);
    
   /* Replace the value present in 7th index as 90 
    Input:   List = 10,20,30,90,10,10,40,50,10 */
    List c=new ArrayList<>();
	c.add(10);c.add(20);c.add(30);c.add(90);c.add(10);c.add(10);c.add(40);c.add(50);c.add(10);
	System.out.println("\nqus9.2: "+c);
        c.remove(7);
	    c.add(7,90);
	    System.out.println("Replace the value present "
	    		+ "\nin 7th index as 90="+c);
	    
	    List d=new ArrayList<>();
		d.add(10);d.add(20);d.add(30);d.add(90);d.add(10);d.add(10);d.add(40);d.add(50);d.add(10);
		System.out.println("\nqus9.3: "+d);
		for(int i=0;i<d.size();i++) {
			Object ob=d.get(i);
			if(ob.equals(10)) {
				d.remove(i);
				d.add(i,100);
			}
		}
		System.out.println("eplace the 10 into 100 in List:"+d);
	    
	    
	    
	

}
}
