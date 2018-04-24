package com.me.codility.launch;

import com.me.codility.solutions.BinaryGap;

public class LaunchSolutions {

	public static void main(String[] args) {
		BinaryGap bg = new BinaryGap();
		int n = 1041;
		System.out.println("Binary Gap of " + n + ": ");
		System.out.println(bg.findBinaryGap(n) + " using Java built-in features");
		System.out.println(bg.findSimpleBinaryGap(n) + " without Java built-in features");
	}
}
