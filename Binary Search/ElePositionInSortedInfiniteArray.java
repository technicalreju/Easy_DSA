package com.binarysearch;

public class ElePositionInSortedInfiniteArray {
	
	static int ans(int[] arr, int target) {
		// first find the range
		// first start with a box value of size of 2
		int start = 0;
		int end = 1;
		// condition for the target to lie in the range
		while(target > arr[end]) {
			int temp = end + 1;		// this is new start
			// double the size of box/range
			// end = prev end + arr length * 2
			end =  end + (end - start + 1)*2;
			start = temp;
		}
		return binarySearch(arr, target, start, end);
	}
	
	static int binarySearch(int[] arr, int target, int start, int end) {
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(target < arr[mid]) {
				end = mid - 1;
			}else if(target > arr[mid]) {
				start = mid + 1;
			}else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {
			2,3,5,8,12,15,3,27,30,39,47,53,59,61,63,68,70,71,75,78,80,90,102,104,105,106,109,112,125,135,163,175,176,179,189,800	
		};
		
		int target = 80;
		int ans = ans(arr, target);
		System.out.println(ans);
	}

}
