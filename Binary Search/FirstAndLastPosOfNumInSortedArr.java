package com.binarysearch;


public class FirstAndLastPosOfNumInSortedArr {
	
	public static int[] searchRange(int[] nums, int target) {
		int[] ans = {-1, -1};
		
		// check for first occurance of target
		int start = search(nums, target, true);
		// check for last occurance of target
		int end = search(nums, target, false);
		
		ans[0] = start;
		ans[1] = end;
		
		return ans;
		
	}
	
	// this function just returns the index value of the target

	static int search(int[] nums, int target, boolean findStartIndex) {
		int ans = -1;
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			// find mid
			int mid = start + (end - start) / 2;

			if (target < nums[mid]) {
				end = mid - 1;
			} else if (target > nums[mid]) {
				start = mid + 1;
			} else {
				// potential ans found
				ans = mid;
				if (findStartIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return ans;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {5,7,7,7,7,8,8,10};
		int target = 7;
		
		int[] res = searchRange(nums, target);
		for(int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}

	}

}
