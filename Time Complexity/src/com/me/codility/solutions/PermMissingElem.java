package com.me.codility.solutions;

public class PermMissingElem {

	public int findMissingElement(int[] array) {
		if (array.length == 0) {
			return 1;
		}

		int aSum = 0;
		int arraySum = 0;
		int n = 0;

		for (int i : array) {
			if (i > n) {
				n = i;
			}
			aSum += i;
		}

		if (n % 2 == 0) {
			arraySum = (n / 2) * (n + 1);
		} else {
			arraySum = ((n + 1) / 2) * n;
		}

		if (arraySum == aSum) {
			return n + 1;
		}
		
		return arraySum - aSum;
	}
}
