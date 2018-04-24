package com.me.codility.solutions;

public class BinaryGap {

	public int findBinaryGap(int N) {
		int binaryGap = 0;
		String n = Integer.toBinaryString(N);
		System.out.printf("%d in Binary: %s", N, n);
		System.out.println();

		int lastOne = n.lastIndexOf('1');
		int noZeros = n.indexOf("0");

		if (noZeros == -1)
		    return binaryGap;

		n = n.substring(0, lastOne + 1);
		String[] list = n.split("1");

		/**
		 * Arrays.sort() Takes too much time. Best way to find out max
		 * value in the array is by simply looping through it
		 * Arrays.sort(list);
		 * binaryGap = list[list.length - 1].length();
		 */
		binaryGap = findMaxElement(list);
		return binaryGap;
	}
	
	public int findSimpleBinaryGap(int N) {
		int binaryGap = 0;
		int counter = 0;
		final String binary = toBinary(N);
		
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '0')
				counter++;
			else if (binary.charAt(i) == '1') {
				if (counter > binaryGap)
					binaryGap = counter;
				counter = 0;
			}
		}
		return binaryGap;
	}
	
	private int findMaxElement(String[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i].length()) 
				max = array[i].length();
		}
		return max;
	}
	
	private String toBinary(int n) {
		StringBuilder sb = new StringBuilder();
		int a = 0;
		
		while (n > 0) {
			a = n % 2;
			sb.insert(0, a);
			n = n / 2;
		}
		
		return sb.toString();
	}
}
