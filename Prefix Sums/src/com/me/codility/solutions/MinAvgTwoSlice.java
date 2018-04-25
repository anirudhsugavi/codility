package com.me.codility.solutions;

public class MinAvgTwoSlice {

	/**
	 * The idea is that an array could be sliced into either 2 elements or 3
	 * elements per slice and the average of one of these slices would be the
	 * minimal average.
	 *
	 * A slice with minimal average would either be a 2 element slice or a 3 element
	 * slice or a super-set of one of these slices.
	 *
	 * To find the slice with the minimal average, compute the average of each
	 * possible 2 element and 3 element slice and pick the minimum among those, and
	 * return the corresponding index.
	 */
	public int findMinAvgSliceIndex(int[] array) {
		final int size = array.length;
		int minIndex = 0;
		double minAvg = (array[0] + array[1]) / 2.0;
		double curAvg;

		for (int i = 1; i < size - 2; i++) {
			curAvg = (array[i] + array[i + 1]) / 2.0;
			if (curAvg < minAvg) {
				minAvg = curAvg;
				minIndex = i;
			}

			curAvg = (array[i] + array[i + 1] + array[i + 2]) / 3.0;
			if (curAvg < minAvg) {
				minAvg = curAvg;
				minIndex = i;
			}
		}

		curAvg = (array[size - 2] + array[size - 1]) / 2.0;
		if (curAvg < minAvg) {
			minAvg = curAvg;
			minIndex = size - 2;
		}

		return minIndex;
	}
}
