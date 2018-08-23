package com.personation.array;

public class HighArray {
	
	private int size;
	private long[] arr;
	
	public HighArray(int max ) {
		arr = new long[max];
		size =0;
	}
//=========================================================
	public void insertElement(int value) {
		arr[size] = value;
		size++;
	}
	
//=======================================================
	
	public boolean searchElement(long value) {
		int i = 0;
		for(i = 0 ; i < size ; i++) {
			if(arr[i] == value)
				break;
		}
		if(i == size)
			return false;
		else
			return true;
		
	}
//================================================================
	public boolean deleteElement(long value) {
		int i = 0;
		for(i = 0 ; i < size ; i++ ) {
			if(arr[i] == value)
				break;
		}
		if(i == size )
			return false;
		else
			for( int j = i ; j < size  ; j ++ )
				arr[j] = arr[j+1];
		size--;
		return true;
	}
//================================================================
	public void displayArray() {
		int i = 0;
		for(i = 0 ; i < size ; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
