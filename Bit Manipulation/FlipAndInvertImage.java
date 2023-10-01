package com.bitmanipulation;

public class FlipAndInvertImage {

	public static void main(String[] args) {
		
		int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
		
		for(int[] row: image) {
			// reverse this array
			for(int i = 0; i < (image[0].length + 1)/2;i++) {
				// swap
				int temp = row[i]^1;
				row[i] = row[image[0].length - 1 - i]^1;
				row[image[0].length - 1 - i] = temp;
			}
		}
		
	}

}
