package com.personation.array;

public class OrderedArray {
	
	private long[] arr;
	private int size;
	
	public OrderedArray(int max) {
		arr = new long[max];
		size = 0;
	}
	
	public int getSize() {
		return size;
	}
	
	public void insertElement(long value) {
		int i;
		for (i = 0; i < size ; i++) {
			if(arr[i] > value) {
				break;
			}			
		}
		for(int k = size; k > i; k--) {
			arr[k] = arr[k-1];			
		}
		arr[i] = value;
		size++;
		
	}
	
	public boolean deleteElement(long value) {
		int i = findElement(value);
		if(i == size)
			return false;
		else
			for(int j = i ; j < size; j++) {
				arr[j] = arr[j+1];				
			}
		size--;
		return true;
			
	}
	
	public int findElement(long value) {
		
		int lowerbound = 0;
		int upperbound = size-1;
		int currentitem;
		while(true) {
			currentitem =(upperbound+lowerbound)/2;
			if(arr[currentitem] == value) {
				return currentitem;
			}
			else if(lowerbound > upperbound) {
				return size;
			}
			else 
				if(arr[currentitem] > value)
					upperbound = currentitem-1;
				else
					lowerbound = currentitem+1;
		}
	}

	public void displayArray() {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
