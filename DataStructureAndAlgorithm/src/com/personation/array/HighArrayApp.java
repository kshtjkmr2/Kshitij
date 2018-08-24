package com.personation.array;

import java.util.Scanner;

public class HighArrayApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HighArray arr = new HighArray(20);
		arr.insertElement(14);
		arr.insertElement(33);
		arr.insertElement(45);
		arr.insertElement(32);
		arr.insertElement(67);
		arr.insertElement(87);
		arr.insertElement(56);
		arr.insertElement(42);
		arr.insertElement(89);
		arr.insertElement(82);
		arr.insertElement(88);
		arr.insertElement(72);
		arr.insertElement(22);
		arr.insertElement(92);
		arr.insertElement(12);
		
		System.out.println("Display Element");
		arr.displayArray();
		System.out.println("\nEnter Element to be search");
		long value = sc.nextLong();
		if(arr.searchElement(value) == true ) {
			System.out.println("Element found "+ value);
		}
		else
			System.out.println("Not found "+ value);
		
		System.out.println("Enter element to be deleted");
		long val = sc.nextLong();
		arr.deleteElement(val);
		arr.displayArray();
	}

}
