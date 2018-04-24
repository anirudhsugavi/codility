package com.me.codility.solutions;

import java.util.HashMap;

public class OddOccurrencesInArray {

	public int findOddOccurrence(int[] A) {
		int odd = 0;

		for (int i : A)
			odd = odd ^ i;

		return odd;
	}

	public int usingHashMap(int[] A) {
		int odd = -1;
		int size = A.length;

		if (size == 1)
			return A[0];

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < size; i++) {
			if (map.get(A[i]) == null) {
				map.put(A[i], 1);
			} else {
				map.put(A[i], map.get(A[i]) + 1);
			}
		}

		for (int entry : map.keySet()) {
			if (map.get(entry) % 2 == 1) {
				odd = entry;
				break;
			}
		}
		return odd;
	}
}
