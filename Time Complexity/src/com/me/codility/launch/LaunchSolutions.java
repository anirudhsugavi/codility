package com.me.codility.launch;

import com.me.codility.solutions.FrogJmp;
import com.me.codility.solutions.PermMissingElem;
import com.me.codility.solutions.TapeEquilibrium;

public class LaunchSolutions {

	public static void main(String[] args) {

		/**
		 * Run a simple Permutation Missing Element program
		 */
		PermMissingElem pme = new PermMissingElem();
		int[] permArray = {1,2,3,4};
		System.out.print("Given array: ");
		printCarArray(permArray);
		System.out.println("Missing Element: " + pme.findMissingElement(permArray));
		
		/**
		 * Run a simple Tape Equilibrium program
		 */
		TapeEquilibrium te = new TapeEquilibrium();
		System.out.println();
		int[] tapeEqArray = {2, 3, 1, 6, 4, 1, 3, 0, 2};
		System.out.print("Given array: ");
		printCarArray(tapeEqArray);
		System.out.println("Tape Equilibrium: " + te.findTapeEquilibrium(tapeEqArray));
		
		/**
		 * Run a simple Frog Jump program
		 */
		FrogJmp fj = new FrogJmp();
		System.out.println();
		int x = 30;
		int y = 85;
		int d = 17;
		System.out.printf("X: %d, Y: %d, D: %d", x, y, d);
		System.out.println("\nNumber of jumps:" + fj.findFrogJumpsNumber(x, y, d));
	}
	
	private static void printCarArray(int[] array) {
		System.out.print("[");
		
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[array.length - 1] + "]");
	}
}
