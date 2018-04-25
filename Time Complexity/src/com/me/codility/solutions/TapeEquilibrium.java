package com.me.codility.solutions;

public class TapeEquilibrium {

	public int findTapeEquilibrium(int[] A) {
		int size = A.length;
		int leftSum = 0;
		int rightSum = 0;
		int eq = Integer.MAX_VALUE;

		for (int i = 0; i < size; i++) {
			rightSum += A[i];
		}

		for (int p = 1; p < size; p++) {
			int pSum = A[p - 1];
			leftSum += pSum;
			rightSum -= pSum;

			int diff = Math.abs(leftSum - rightSum);
			if (diff < eq) {
				eq = diff;
			}
		}
		
		return eq;
	}
}
