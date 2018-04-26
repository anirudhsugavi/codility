package com.me.codility.launch;

import com.me.codility.solutions.FrogRiverOne;
import com.me.codility.solutions.MaxCounters;
import com.me.codility.solutions.MissingInteger;
import com.me.codility.solutions.PermCheck;

public class LaunchSolutions {

	public static void main(String[] args) {

		/**
		 * Run a simple Permutation Check program
		 */
		PermCheck pc = new PermCheck();
		int[] permArray = { 4, 1, 3, 2 };
		System.out.print("Given array: ");
		printArray(permArray);
		boolean isPerm = (pc.checkPermutation(permArray) == 1) ? true : false;
		System.out.println("Is permutation?: " + isPerm);

		/**
		 * Run a simple Frog River One program
		 */
		FrogRiverOne fo = new FrogRiverOne();
		int x = 5;
		int[] frogArray = { 1, 3, 1, 4, 2, 3, 5, 4 };
		System.out.println();
		System.out.print("Given array: ");
		printArray(frogArray);
		System.out.println("Can cross at second: " + fo.frogRiverOne(x, frogArray));

		/**
		 * Run a simple Missing Integer program
		 */
		MissingInteger mi = new MissingInteger();
		int[] intArray = { 1, 3, 6, 4, 1, 2 };
		System.out.println();
		System.out.print("Given array: ");
		printArray(intArray);
		System.out.println("Missing integer: " + mi.findMissingInteger(intArray));

		/**
		 * Run a simple Max Counters program
		 */
		MaxCounters mc = new MaxCounters();
		int n = 5;
		int[] array = { 3, 4, 4, 6, 1, 4, 4 };
		System.out.println();
		System.out.print("Given array: ");
		printArray(array);
		System.out.println("Max counter array: ");
		int[] maxCounter = mc.getMaxCountersArray(n, array);
		printArray(maxCounter);
	}

	private static void printArray(int[] array) {
		System.out.print("[");

		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[array.length - 1] + "]");
	}
}
