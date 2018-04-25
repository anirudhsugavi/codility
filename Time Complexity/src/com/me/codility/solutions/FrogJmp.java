package com.me.codility.solutions;

public class FrogJmp {

	public int findFrogJumpsNumber(int x, int y, int d) {
		int n = y - x;
		
		if (n % d == 0) {
			return n / d;
		} else {
			return n / d + 1;
		}
	}
}
