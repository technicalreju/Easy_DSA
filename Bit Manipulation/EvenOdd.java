package com.bitmanipulation;

import java.util.Scanner;

public class EvenOdd {
	
	
	// to find of the number is odd or not
	// if it is odd then return true else false
	private static boolean  isOdd(int n) {
		return (n&1) == 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		for(int i = 0; i < 4; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(isOdd(arr[i])) {
				count += 1;
			}
		}
		System.out.println(count);
	}

}
