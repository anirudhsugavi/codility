package com.me.codility.launch;

import com.me.codility.solutions.CountDiv;

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
	}
}
