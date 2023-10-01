package com.bitmanipulation;

public class SingleEle {
	
	private static int ans(int[] arr) {
		int unique = 0;
		for(int i : arr) {
			unique ^= i;
		}
		return unique ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,6,3,4,3,6,4};
		System.out.println(ans(arr));
	}

}
