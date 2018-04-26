package com.me.codility.solutions;

public class MissingInteger {

	public int findMissingInteger(int[] intArray) {
		final int size = intArray.length;
		int[] counter = new int[size];

		for (int i = 0; i < size; i++) {
			if (intArray[i] > 0 && intArray[i] <= size)
				counter[intArray[i] - 1]++;
		}

		for (int i = 0; i < size; i++) {
			if (counter[i] == 0)
				return i + 1;
		}
		return size + 1;
	}
}
