package com.me.codility.launch;

import com.me.codility.solutions.CyclicRotation;
import com.me.codility.solutions.OddOccurrencesInArray;

public class LaunchSolutions {

	public static void main(String[] args) {
		
		/**
		 * Run a sample Cyclic Rotation program
		 */
		CyclicRotation cr = new CyclicRotation();
		int[] array = {3, 5, 2, 8, 1, 6};
		int k = 3;
		
		System.out.println("Given array: ");
		printArray(array);
		
		System.out.println(k + " times rotated array: ");
		printArray(cr.cyclicRotationRight(array, k));
		
		/**
		 * Run a sample Odd Occurrences in an Array program
		 */
		OddOccurrencesInArray oc = new OddOccurrencesInArray();
		int[] oddArray = {2, 1, 3, 4, 2, 5, 3, 3, 3, 1, 5};
		
		System.out.println("Given array: ");
		printArray(oddArray);
		
		System.out.println("Odd occurrence: " + oc.findOddOccurrence(oddArray));
		System.out.println("Odd occurrence: " + oc.usingHashMap(oddArray) + " using HashMap");
	}
	
	public static void printArray(int[] a) {
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			if (i != a.length - 1)
				System.out.print(a[i] + ", ");
			else
				System.out.println(a[i] + "]");
		}
		System.out.println();
	}
}
