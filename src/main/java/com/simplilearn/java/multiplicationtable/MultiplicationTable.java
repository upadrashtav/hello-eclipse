package com.simplilearn.java.multiplicationtable;

public class MultiplicationTable {
	
		public static void main(String[] args) {
		
		MultiplicationTable anyNumber = new MultiplicationTable();
		
		int number = 13;
		int noOfTerms = 12;
		
		anyNumber.calculateTable(number,noOfTerms);	
	}

	public void calculateTable(int number, int noOfTerms) {
		for (int i = 0; i <= noOfTerms; i++) {
			System.out.println(number + " X " + i + " = " + (number * i));
		}
		
	}

}
