package com.me.codility.solutions;

public class GenomicRangeQuery {

	/**
	 * There are two things happening with the 2-D genomic array: 1. Compute three
	 * 1-D arrays of size (n + 1) each with 1's representing the indices of the
	 * genes in string s. 2. Compute Prefix sum for each one of these arrays
	 * 
	 * Compute start and end index from the given p and q arrays
	 * 
	 * If (value at end) - (value at start) is zero in a prefix sum array, then
	 * there are no genes corresponding to that array present in the range (start,
	 * end)
	 * 
	 * If the above condition is false for all A, C and G, then the only remaining
	 * gene is the result
	 */
	public int[] getGenomicRangeQuery(String s, int[] p, int[] q) {
		final int n = s.length();
		final int m = p.length;
		int[][] genomic = new int[3][n + 1];
		int a, c, g;
		int[] result = new int[m];

		for (int i = 0; i < n; i++) {
			a = 0;
			c = 0;
			g = 0;

			if ('A' == s.charAt(i)) {
				a = 1;
			}
			if ('C' == s.charAt(i)) {
				c = 1;
			}
			if ('G' == s.charAt(i)) {
				g = 1;
			}

			genomic[0][i + 1] = genomic[0][i] + a;
			genomic[1][i + 1] = genomic[1][i] + c;
			genomic[2][i + 1] = genomic[2][i] + g;
		}

		for (int i = 0; i < m; i++) {
			int start = p[i];
			int end = q[i] + 1;

			if (genomic[0][end] - genomic[0][start] > 0)
				result[i] = 1;
			else if (genomic[1][end] - genomic[1][start] > 0)
				result[i] = 2;
			else if (genomic[2][end] - genomic[2][start] > 0)
				result[i] = 3;
			else
				result[i] = 4;
		}

		return result;
	}
}
