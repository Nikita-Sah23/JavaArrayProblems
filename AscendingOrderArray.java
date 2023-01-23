package com.arrayPrograms;

import java.util.Arrays;

public class AscendingOrderArray {

	public static void main(String[] args) {

		int[] array = new int[] { 55, 85, 52, 56, 5 };

		Arrays.sort(array);
		System.out.println(" Array  in an ascending order");

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
