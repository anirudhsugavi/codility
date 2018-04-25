package com.me.codility.solutions;

public class CountDiv {
	
	public int countDivisibleIntegers(int a, int b, int k) {
		int result = (a % k) == 0 ? 1 : 0;
		
		result += (b / k) - (a / k);
		return result;
	}
}
