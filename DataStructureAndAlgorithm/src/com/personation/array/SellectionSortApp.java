package com.personation.array;

public class SellectionSortApp {

	public static void main(String[] args) {
		SelectionSort b = new SelectionSort(20) ;
		
		b.insertElement(23);
		b.insertElement(21);
		b.insertElement(78);
		b.insertElement(76);
		b.insertElement(87);
		b.insertElement(12);
		b.insertElement(43);
		b.insertElement(65);
		b.insertElement(28);
		b.insertElement(33);
		
		System.out.println("Display Array");
		b.displayArray();
		System.out.println("\nSorted Array");
		b.sellectionSort();
		
		b.displayArray();
		System.out.println("\nSize = "+b.getsize());;
	}

}
