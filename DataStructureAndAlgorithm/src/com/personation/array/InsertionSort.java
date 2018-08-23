package com.personation.array;

public class InsertionSort {
	
	private long[] arr;
	private int size;
//====================================================	
	public InsertionSort(int max) {
          arr = new long[max];
          size = 0;
	}
//====================================================	
	public int getsize() {
		
		return size;
	}
//====================================================	
	public void insertElement(int value) {
		arr[size] = value;
		size++;
	}
//====================================================	
	public void displayArray() {
		
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}
//====================================================
	public void swap(int one , int two) {
		long temp = arr[one];
		arr[one] = arr[two];
		arr[two] = temp;
	}
//====================================================
	
	public void insertionSort() {
		
		int i , j ;
		
			for( i = 1 ; i < size ; i++) {
				
				long temp = arr[i];
				j = i ;
				while(j > 0 && arr[j-1] >= temp) {
					arr[j] = arr[j-1];
					j--;
				}
				arr[j] = temp;
				
			}
	}
	
}
