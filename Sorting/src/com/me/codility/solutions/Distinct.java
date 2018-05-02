package com.me.codility.solutions;

import java.util.Arrays;

public class Distinct {

	public int findDistictElements(int[] A) {
		if (A.length == 0)
			return 0;

		Arrays.sort(A);
		int count = 1;

		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] != A[i + 1]) {
				count++;
			}
		}

		return count;
	}
}
