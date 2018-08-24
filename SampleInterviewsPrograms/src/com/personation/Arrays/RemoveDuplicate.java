package com.personation.Arrays;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter length of an array");
		int len = sc.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter Element in array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();			
		}
		removeduplicate(arr,len);

	}
	public static void removeduplicate(int[] arr,int len) {
		if(len==0||len==1) {
			display(arr,len);
		}
		int temp;
		int i,j;
		for(i = 0; i < arr.length ; i++) {
			for(j = i+1 ; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					temp = arr[j];
					
				}
			}
			
		}
		display(arr,len);
	}
	private static void display(int[] arr, int len) {
		
		for (int j2 = 0; j2 < arr.length; j2++) {
			System.out.print(arr[j2]+ " ");
		}
		
	}

}
