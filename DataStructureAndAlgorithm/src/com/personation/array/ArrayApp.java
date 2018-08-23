package com.personation.array;

import java.util.Scanner;

public class ArrayApp {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of an array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		//Inserting element into the array;
		System.out.println("Enter Element having size = "+size);
		int i = 0;
		for( i = 0 ; i < size ; i++ ) {
			
			arr[i] = sc.nextInt();
		} 
		
		 
		  System.out.println("Initial array is");
		  displayArray(arr, size);
		  System.out.println("\nEnetr Element to be searched");
		  int element = sc.nextInt();
		  searchElement(element, arr);
		  System.out.println("Eneter Element to be deleted");
		  int element1 = sc.nextInt();
		  deleteElement(element1, arr);
		
		sc.close();

	}
//===================================================================
	private static void displayArray(int[] arr, int len) {
		int i = 0;
		
		for(i = 0 ; i < len ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
//===================================================================	
	
	public static void searchElement(int element,int[] arr ) {
		int i = 0;
		for(i = 0 ; i < arr.length ; i++) {
			if(arr[i] == element)
				break;
		}
		if(i == arr.length)
			System.out.println("Element not found "+element);
		else
			System.out.println("Element found");
	}
	
//===================================================================
	
	public static void deleteElement(int element , int[] arr) {
		int len = arr.length;
		int i = 0;
		int j = 0;
		for(i = 0 ;i <arr.length ; i++) {
			if(arr[i] == element)
			   break;
		}
		for(j = i ; j <arr.length-1 ; j++ )
			arr[j] = arr[j+1];
		len--;
		System.out.println("final array is ");
		displayArray(arr, len);
		
	}

}
