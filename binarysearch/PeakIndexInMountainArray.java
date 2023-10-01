package com.binarysearch;

public class PeakIndexInMountainArray {
	
	public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                // you are in desc part of array
                // this may be the ans, but look at left
                // this is why ens != mid - 1
                 end = mid;
            }else{
                // you are in asc part of array
                start = mid + 1;
            }
        }
        // in the end, star == end and pointing to the largest number because of the two checks above
        // start and end are always trying to find max element in above two checks
        // hence when they are pointing to just one element, that is the max one bcoz that the checks say
        // at every point of time for start and end, they have the best possible ans til that time 
        // and if we are saying that only one item is remaining, hence bcoz of above line that is the best possible ans
        return start;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		array is devided into two parts first half is ascending order and then one peak element and then remaining half 
//		in the desceding order
//		This kind of array is called as Botinic array
//		OR in this prpblem Mountain array
		
//		    7    <- (peak index/element)
//		   5 6
//		  3   4
//		 2     2
//		1
		
		int[] arr = {1,2,3,5,7,6,4,2};
		int ans = peakIndexInMountainArray(arr);
		System.out.println(ans);

	}

}
