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
		int[] res = new int[len];
		int k = 0;
		if(len==0||len==1) {
			display(arr,len);
		}
		int i,j;
		for(i = 0; i < arr.length ; i++) {
			for(j = i+1 ; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					arr[j] = 0;
				}
			}
		}
		for(i = 0 ; i < len ;  i++) {
			if(arr[i] != 0)
				res[k++] = arr[i]; 
			   len--;
		}
		display(res,len);
	}
	private static void display(int[] res, int k) {
		
		for (int j2 = 0; j2 < k; j2++) {
			System.out.print(res[j2]+ " ");
		}
		
	}

}
