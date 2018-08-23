package com.personation.array;

public class LowArray {
	private long[] arr;
	public LowArray(int size) {
		
		arr = new long[size];
	}
	
	public long  getElement(int index) {
		return arr[index];
	}
	public void setElement(int index , long value) {
		arr[index] = value;
	}
	

}
