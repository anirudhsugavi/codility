package com.me.codility.solutions;

public class PermCheck {

	public int checkPermutation(int[] array) {
		final int size = array.length;
        int[] noDuplicates = new int[size];
        int counter = 0;
        
        for (int i = 0; i < size; i++) {
            int val = array[i];
            if (val > size)
                return 0;
            if (noDuplicates[val - 1] == 0) {
                counter++;
                noDuplicates[val - 1] = 1;
            }
            else
                return 0;
        }
        
        return (counter == size) ? 1 : 0;
	}
}
