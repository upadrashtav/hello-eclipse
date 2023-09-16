package com.simplilearn.java.hello;

public class Demo {
	
	public static void main (String [] args) {
		integerDemo();
		floatingPointDemo();
		System.out.println("true xor true " + xor(true, true));
		System.out.println("true xor false " + xor(true, false));
		System.out.println("false xor true " + xor(false, true));
		System.out.println("false xor false " + xor(false, false));
	}
	
	public static boolean xor (boolean left, boolean right) {
		/* return left != right */
		/* return ((left || right) && !(left && right)) */
		if (left && right) {
			return false;
		} else if (left || right) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void integerDemo() {
		System.out.println("Hello Demo Of Integers:\n");
		System.out.println("Largest integer value is: " + Integer.MAX_VALUE);
		System.out.println("Smallest integer value is: " + Integer.MIN_VALUE);
		System.out.println("Largest long value is: " + Long.MAX_VALUE);
		System.out.println("Smallest long value is: " + Long.MIN_VALUE);
		System.out.println("Largest short value is: " + Short.MAX_VALUE);
		System.out.println("Smallest short value is: " + Short.MIN_VALUE);
		System.out.println("Largest byte value is: " + Byte.MAX_VALUE);
		System.out.println("Smallest byte value is: " + Byte.MIN_VALUE);
	}
	
	public static void floatingPointDemo() {
		double d = 2.49;
		float f = 2.49f;
		double negInf = Double.NEGATIVE_INFINITY;
		double posInf = Double.POSITIVE_INFINITY;
		double nan = Double.NaN;
		System.out.println( "Hello Demo of Floating Points: \n");
		System.out.println( "\nDouble: " + d);
		System.out.println( "\nFloat " + f);
		System.out.println( "\nNegative Infinity: " + negInf);
		System.out.println( "\nPositive Infinity:  " + posInf);
		System.out.println( "\nNot a Number: " + nan);
	}
}
