package com.arrayPrograms;

public class ArrayOddPositions {

	public static void main(String[] args) {

		int[] arr = new int[] { 11, 12, 66, 4, 5, 6, 87, 8, 9 };
		System.out.println("Elements of given array present on odd position: ");

		for (int i = 0; i < arr.length; i = i + 2) {
			System.out.println(arr[i]);

		}
	}

}
