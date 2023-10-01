package com.binarysearch;

public class FloorOfNuber {
	
	// floor: greatest number less than equal to target

	static int floor(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return end;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
		int target = 15;
		int res = floor(arr, target);
		System.out.print("Ceiling of a Number " + target + " is : " + res);
	}

}
