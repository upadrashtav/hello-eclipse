package com.simplilearn.java.hello;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Add " + add2 (10,90));
		System.out.println("Add " + add3 (10,90,-100));
		System.out.println("Subtract " + subtract (10,90));
		System.out.println("Multiply " + multiply (10,90));
		System.out.println("Divide " + divide (90,10));
		
		System.out.println("true nxor true " + nxor(true, true));
		System.out.println("true nxor false " + nxor(true, false));
		System.out.println("false nxor true " + nxor(false, true));
		System.out.println("false nxor false " + nxor(false, false));
		
		System.out.println("Number is: " + isEven(13));
		
		System.out.println("Number is: " + isOdd(14));
		
		System.out.println("Is 99 Less Than 79? " + lt(99,79));

	}
	
	// Add 2 numbers
	private static int add2( int left, int right) {
		return left + right;
	}
	
	// Add 3 numbers
	private static int add3( int number1, int number2, int number3) {
		return number1 + number2 + number3;
	}
		
	// Simple Subtraction
	private static int subtract( int left, int right) {
		return left - right;
	}
		
	// Simple Multiplication
	private static int multiply( int left, int right) {
		return left * right;
	}
		
	// Simple Divide
	private static int divide( int left, int right) {
		return left / right;
	}
		
	// Is a number Even?
	private static boolean isEven( int number) {
		return (number % 2 == 0);
	}
		
	// Is a number Odd?
	private static boolean isOdd( int number) {
		return (number % 2 != 0);
	}
		
	// Is number1 less than number2?
	private static boolean lt( int number1, int number2) {
		return (number1 < number2);
	}
	
	public static boolean nxor (boolean left, boolean right) {
		return ((left && right) || !(left && !right));
		/*
		if (left && right) {
			return true;
		} else if (!left && !right) {
			return true;
		}else {
			return false;
		}
		*/
	}

}
