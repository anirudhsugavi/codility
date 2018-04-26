package com.me.codility.solutions;

public class MaxCounters {

	/**
	 * Compute and maintain a lastUpdated variable every time max() operation is
	 * called. Use this to update the counter array
	 */
	public int[] getMaxCountersArray(int n, int[] array) {
		int lastUpdated = 0;
		int currentMax = 0;
		int[] counter = new int[n];

		for (int i = 0; i < array.length; i++) {
			if (array[i] == (n + 1)) {
				lastUpdated = currentMax;
			} else {
				int position = array[i] - 1;
				if (counter[position] < lastUpdated)
					counter[position] = lastUpdated + 1;
				else
					counter[position]++;

				if (counter[position] > currentMax)
					currentMax = counter[position];
			}
		}

		for (int i = 0; i < counter.length; i++) {
			if (counter[i] < lastUpdated)
				counter[i] = lastUpdated;
		}

		return counter;
	}
}
