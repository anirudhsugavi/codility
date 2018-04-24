package com.me.codility.solutions;

public class CyclicRotation {
	public int[] cyclicRotationRight(int[] A, int K) {
		int size = A.length;

		if (K == size)
			return A;

		int[] sol = new int[size];
		int modIndex = 0;

		for (int i = 0; i < size; i++) {
			modIndex = (i + K) % size;
			sol[modIndex] = A[i];
		}
		return sol;
	}
}
