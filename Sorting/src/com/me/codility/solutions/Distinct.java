package com.me.codility.solutions;

import java.util.Arrays;

public class Distinct {

	public int findDistictElements(int[] array) {
		if (array.length == 0)
			return 0;

		Arrays.sort(array);
		int count = 0;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] != array[i + 1]) {
				count++;
			}
		}

		return count;
	}
}
