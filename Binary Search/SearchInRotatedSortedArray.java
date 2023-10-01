package com.binarysearch;

public class SearchInRotatedSortedArray {
	
	public static int searchInRotatedSortedArray(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			// check mid == target
			if(arr[mid] == target) {
				return mid;
			}
			
			// check left half is sorted
			if(arr[start] <= arr[mid]) {
				if(target >= arr[start] && target <= arr[mid]) {
					end = mid - 1;
				}else {
					start = mid + 1;
				}
			}
			
			// right half is sorted
			else {
				if(target >= arr[mid] && target <= arr[end]) {
					start = mid + 1;
				}else {
					end = mid - 1;
				}
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,1};
		int target = 1;
		int ans = searchInRotatedSortedArray(arr, target);
		System.out.println(ans);
		
	}

}
