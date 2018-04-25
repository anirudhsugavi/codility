package com.me.codility.launch;

import com.me.codility.solutions.CountDiv;
import com.me.codility.solutions.MinAvgTwoSlice;
import com.me.codility.solutions.PassingCars;

public class LaunchSolutions {

	public static void main(String[] args) {
		/**
		 * Run a simple Count Divisible Integers program
		 */
		CountDiv cd = new CountDiv();
		int a = 16;
		int b = 349;
		int k = 17;
		System.out.printf("A: %d, B: %d, K: %d", a, b, k);
		System.out.println();
		System.out.println("Divisible Integers: " + cd.countDivisibleIntegers(a, b, k));
		
		/**
		 * Run a simple Passing Cars program 
		 */
		PassingCars pc = new PassingCars();
		int[] array = {1, 0, 0, 1, 1, 1, 0, 0, 1};
		System.out.println();
		System.out.print("Given array of cars: ");
		printCarArray(array);
		System.out.println("Number of passing cars: " + pc.countPassingCars(array));
		
		/**
		 * Run a simple Minimum Average of a Slice program
		 */
		
		MinAvgTwoSlice ms = new MinAvgTwoSlice();
		int[] sliceArray = {4, 2, 2, 5, 1, 5, 8};
		System.out.println();
		System.out.print("Given array: ");
		printCarArray(sliceArray);
		System.out.println("Starting index of minimum average slice: " + ms.findMinAvgSliceIndex(sliceArray));
	}

	private static void printCarArray(int[] cars) {
		System.out.print("[");
		
		for (int i = 0; i < cars.length - 1; i++) {
			System.out.print(cars[i] + ", ");
		}
		System.out.println(cars[cars.length - 1] + "]");
	}
}
