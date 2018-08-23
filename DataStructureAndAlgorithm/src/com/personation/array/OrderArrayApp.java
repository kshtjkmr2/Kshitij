package com.personation.array;

import java.util.Scanner;

public class OrderArrayApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		OrderedArray arr = new OrderedArray(20);
		arr.insertElement(10);
		arr.insertElement(20);
		arr.insertElement(9);
		arr.insertElement(45);
		arr.insertElement(87);
		arr.insertElement(23);
		arr.insertElement(32);
		arr.insertElement(12);
		arr.insertElement(65);
		System.out.println("Array is as follaws");
		arr.displayArray();
		System.out.println("\nEnter element to be search");
		long value = sc.nextLong();
		if(arr.findElement(value) < arr.getSize()) {
			System.out.println("found");
		}
		else
			System.out.println("Not found");
		
		System.out.println("Enter element to be deleted");
		long value1 = sc.nextLong();
		arr.deleteElement(value1);
		System.out.println("Display array");
		arr.displayArray();
	}
}
