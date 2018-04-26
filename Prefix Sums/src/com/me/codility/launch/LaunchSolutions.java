package com.me.codility.launch;

import com.me.codility.solutions.CountDiv;
import com.me.codility.solutions.GenomicRangeQuery;
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
		printArray(array);
		System.out.println("Number of passing cars: " + pc.countPassingCars(array));
		
		/**
		 * Run a simple Minimum Average of a Slice program
		 */
		MinAvgTwoSlice ms = new MinAvgTwoSlice();
		int[] sliceArray = {4, 2, 2, 5, 1, 5, 8};
		System.out.println();
		System.out.print("Given array: ");
		printArray(sliceArray);
		System.out.println("Starting index of minimum average slice: " + ms.findMinAvgSliceIndex(sliceArray));
		
		/**
		 * Run a simple Genomic Range Query program
		 */
		GenomicRangeQuery grq = new GenomicRangeQuery();
		String genes = "CAGCCTA";
		int[] p = {2, 5, 0};
		int[] q = {4, 5, 6};
		System.out.println();
		System.out.println("Given array of genes: " + genes);
		System.out.print("P: ");
		printArray(p);
		System.out.print("Q: ");
		printArray(q);
		int[] genomicResult = grq.getGenomicRangeQuery(genes, p, q);
		System.out.print("Result: ");
		printArray(genomicResult);
	}

	private static void printArray(int[] array) {
		System.out.print("[");
		
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[array.length - 1] + "]");
	}
}
