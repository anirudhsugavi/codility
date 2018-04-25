package com.me.codility.solutions;

public class MinAvgTwoSlice {
	
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
