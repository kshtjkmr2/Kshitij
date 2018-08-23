package com.personation.array;

public class SelectionSort {
	
	private long[] arr;
	private int size;
//====================================================	
	public SelectionSort(int max) {
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
	
	public void sellectionSort() {
		
		int i , j ;
		
			for( i = 0 ; i < size - 1; i++) {
				int min = i;
				for(j = i+1 ; j < size ; j++) {
					if(arr[j] < arr[min]) {
						min = j;
					}
				}
				swap(i,min);
			}
	}
	
}
