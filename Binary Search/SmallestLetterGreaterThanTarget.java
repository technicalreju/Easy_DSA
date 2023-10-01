package com.binarysearch;

public class SmallestLetterGreaterThanTarget {

	public static char nextGreatestLetter(char[] letters, char target) {
		
		int start = 0;
		int end = letters.length - 1;
		while(start <= end) {
			int mid = start + (end-start)/2;
			if(target < letters[mid]) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		return letters[start % letters.length];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		sample code
//		input 1:
//		Input: letters = ["c","f","j"], target = "a"
//		Output: "c"
//		input 2:
//		Input: letters = ["c","f","j"], target = "d"
//		Output: "f"
//		input 3: (letters are wrapped around)
//		Input: letters = ["c","f","j"], target = "j"
//		Output: "c"
		
		char[] letters = {'c','f','j'};
		char target = 'd';
		char res = nextGreatestLetter(letters, target);
		System.out.println(res);		
		
	}

}
