package com.me.codility.solutions;

public class PassingCars {
	
	public int countPassingCars(int[] array) {
		int count = 0;
		int increment = 0;
		
		for (int car : array) {
			if (car == 0) {
				increment++;
			} else {
				count += increment;
				if (count > 1000000000) {
					return -1;
				}
			}
		}
		
		return count;
	}
}
