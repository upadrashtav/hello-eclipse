package com.simplilearn.java.areacalc;

import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int choice;
		boolean toContinue = true;
		
		while (toContinue) {
			System.out.println("Shape Area Calculator version 1.0\n\n");
			System.out.println("Please choose the shape for your you need area calculated: \n\n");
			System.out.println("1) Triangle");
			System.out.println("2) Rectangle");
			System.out.println("3) Square");
			System.out.println("4) Circle");
			System.out.println("5) Quit");
			
			choice = input.nextInt();
			
			switch (choice){
				case 1: area_triangle();
						break;
				case 2: area_rectangle();
						break;
				case 3: area_square();
						break;
				case 4: area_circle();
						break;
				case 5: 
				default: 
						toContinue = false;
						break;
			}
		};	
		
		System.out.println("Thank you for using the area calculator\n");
		input.close();
	}
		
		private static void area_triangle( ) {
			
			Scanner triangleInput = new Scanner(System.in);
			int base = 0;
			int height = 0;
			double area_trngle = 0;
			System.out.println("What is the base of the triangle? ");
			base = triangleInput.nextInt();
			System.out.println();
			System.out.println("What is the height of the triange? ");
			height = triangleInput.nextInt();
			System.out.println();
			area_trngle = (base * height) / 2;
			System.out.println("Area of the triangle is: "+area_trngle);
			return;		
		}
		
		private static void area_rectangle( ) {
			Scanner rectangleInput = new Scanner(System.in);
			int length = 0;
			int width = 0;
			double area_rectngle = 0;
			System.out.println("What is the length of the rectangle? ");
			length = rectangleInput.nextInt();
			System.out.println();
			System.out.println("What is the width of the rectangle? ");
			width = rectangleInput.nextInt();
			System.out.println();
			area_rectngle = (length * width);
			System.out.println("Area of the rectangle is: "+area_rectngle);
			return;	
		}
		
		private static void area_square( ) {
			Scanner sqInput= new Scanner(System.in);
			int side = 0;
			int area_square = 0;
			System.out.println("What is the side of a square? ");
			side = sqInput.nextInt();
			System.out.println();
			area_square = (side*side);
			System.out.println("Area of the square is: "+area_square);
			return;	
		}
		
		private static void area_circle( ) {
			
			Scanner circleInput = new Scanner(System.in);
			int radius = 0;
			double area_circle = 0;
			System.out.println("What is the radius of the circle? ");
			radius = circleInput.nextInt();
			System.out.println();
			area_circle = (Math.PI*radius*radius);
			System.out.println("Area of the circle is: "+area_circle);
			return;	
		}
	}
