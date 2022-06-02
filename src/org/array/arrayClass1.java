package org.array;

public class arrayClass1 {
//Description : Write a Java program to sum values of an array
    //Input a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
    //Output   = 55
	public static void main(String[] args) {

	
	int ar[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int sum=0,avg=0;
	for(int i=0;i<ar.length;i++) {
		sum=sum+ar[i];
		avg=sum/ar.length;
	}
	System.out.println("sum of all num="+sum);
	System.out.println("avg of num="+avg);
}
}
