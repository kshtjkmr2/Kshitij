package com.personation.Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate_set {

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

	public static void removeduplicate(int[] arr, int len) {
		HashSet<Integer>  hs= new HashSet<>();
		for(int i = 0 ; i<len ; i++) {
			hs.add(arr[i]);
		}
		System.out.println(hs);
		
	}

}
