package com.me.codility.solutions;

public class NumberOfDiscIntersections {

	/**
	 * Create an array containing the points of the right edges of the disks. If any
	 * of the disks' right edge extends beyond (n - 1), mark it at (n - 1). Then,
	 * find the prefix sum of this array. Next step is to calculate the maximum
	 * possible number of intersections, which is n * (n - 1) / 2. After this, get
	 * the positive point of the left edge of a disk. Subtracting the value of the
	 * prefix sum array at this index from the max intersections gives the required
	 * result!
	 */
	public int findNumberOfIntersections(int[] A) {
		final int n = A.length;
		int[] rightEdges = new int[n];
		int right;

		for (int i = 0; i < n; i++) {
			long rightEdge = (long) i + A[i];
			if (rightEdge >= n - 1) {
				right = n - 1;
			} else {
				right = (int) rightEdge;
			}

			rightEdges[right]++;
		}

		for (int i = 1; i < n; i++) {
			rightEdges[i] += rightEdges[i - 1];
		}

		long intersections = (long) n * (n - 1) / 2;
		int left;

		for (int i = 0; i < n; i++) {
			int leftEdge = i - A[i];
			if (leftEdge < 0) {
				left = 0;
			} else {
				left = leftEdge;
			}

			if (left > 0) {
				intersections -= rightEdges[left - 1];
			}
		}

		if (intersections > 10_000_000) {
			return -1;
		}

		return (int) intersections;
	}

	/**
	 * Simplest solution. Time complexity is O(n ^ 2). For every disk, check if the
	 * point of its right edge is greater than or equal to the point of the left
	 * edges of the subsequent disks. Increment the counter if this condition is
	 * true.
	 */
	public int simplestSolution(int[] A) {
		int intersections = 0;
		for (int i = 0; i < A.length; i++) {
			long rightEdge = (long) A[i] + i;
			for (int j = i + 1; j < A.length; j++) {
				long leftEdge = (long) j - A[j];
				if (rightEdge >= leftEdge) {
					intersections++;
				}
			}
		}

		if (intersections > 10_000_000) {
			return -1;
		}

		return intersections;
	}
}
