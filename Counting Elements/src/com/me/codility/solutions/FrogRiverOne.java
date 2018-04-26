package com.me.codility.solutions;

public class FrogRiverOne {

	public int frogRiverOne(int x, int[] a) {
		int expectedSum = (int) (x * (x + 1) / 2.0);
        int[] leaves = new int[x];
        int leavesSum = 0;
        
        for (int i = 0; i < a.length; i++) {
            int position = a[i] - 1;
            if (leaves[position] == 0) {
                leaves[position] = a[i];
                leavesSum += a[i];
            }
            
            if (expectedSum == leavesSum)
                return i;
        }
        return -1;
	}
}
