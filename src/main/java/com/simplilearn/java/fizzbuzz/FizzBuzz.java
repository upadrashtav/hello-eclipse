package com.simplilearn.java.fizzbuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		boolean multiple3;
		boolean multiple5;
		int number;
		
		for (number = 1;number <=100; number++) {
			multiple3 = false;
			multiple5 = false;
			if ((number % 3) == 0) {
				multiple3 = true;
			}
			if ((number % 5) ==0) {
				multiple5 = true;
			}
			if (multiple3 && multiple5) {
				System.out.println("FizzBuzz");
			} else if (multiple3){
				System.out.println("Fizz");
			} else if (multiple5) {
				System.out.println("Buzz");
			} else {
				System.out.println (number);
			}
		}

	}

}
