package com.personation.array;

public class BubbleSort {
	
	private long[] arr;
	private int size;
//====================================================	
	public BubbleSort(int max) {
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
	
	public void bubbleSort() {
		
		int i , j ;
		for(i = size-1; i >1 ; i-- ) {
			for(j = 0 ; j<i ; j++) {
				if(arr[j] > arr[j+1])
					swap(j,j+1);
			}
			
		}
	}
	
}
