package com.me.codility.solutions;

import java.util.Arrays;

public class Triangle {

	public int isTriangle(int[] triangle) {
		Arrays.sort(triangle);
		
		for (int i = 0; i < triangle.length - 2; i++) {
			long p = triangle[i];
			long q = triangle[i + 1];
			long r = triangle[i + 2];
			
			if ((p + q) > r && (q + r) > p && (r + p) > q) {
				return 1;
			}
		}
		
		return 0;
	}
}
