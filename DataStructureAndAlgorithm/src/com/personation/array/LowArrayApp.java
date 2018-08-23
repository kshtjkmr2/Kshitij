package com.personation.array;

import java.util.Scanner;

public class LowArrayApp {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		LowArray arr = new LowArray(20);
		int len = 0;
		arr.setElement(0, 10);
		arr.setElement(1, 98);
		arr.setElement(2, 65);
		arr.setElement(3, 13);
		arr.setElement(4, 67);
		arr.setElement(5, 55);
		arr.setElement(6, 34);
		arr.setElement(7, 14);
		arr.setElement(8, 43);
		arr.setElement(9, 20);
		arr.setElement(10, 30);
		
		len = 11;
		
		System.out.println("Display array");
		displayarray(arr,len);
		System.out.println("\nEnter Element to be search");
		long element = sc.nextLong();
		searchElement(arr,element,len);
		System.out.println("\nEnter Element to be delete");
		long element1 = sc.nextLong();
		deleteElement(arr,element1,len);

	}

//================================================================================
	
	private static void deleteElement(LowArray arr, long element1, int len) {
		
		int i = 0;
		for(i = 0 ; i < len ; i++ ) {
			if(arr.getElement(i) == element1)
				break;
		}
		for (int j = i; j < len ; j++) {
			arr.setElement(j, arr.getElement(j+1));
			
		}
		len--;
		displayarray(arr, len);
		
	}
//===========================================================================
	private static void searchElement(LowArray arr, long element,int len) {
		int i = 0;
		for ( i = 0; i < len; i++) {
			if(arr.getElement(i) == element)
				break;
			
		}
		if(i == len)
			System.out.println("not found "+element);
		else
			System.out.println("found "+ element);
	}
//==================================================================
	
	private static void displayarray(LowArray arr, int len) {
		
		for (int i = 0; i < len; i++) {
			System.out.print(arr.getElement(i)+ " ");
		}
		
	}

}
