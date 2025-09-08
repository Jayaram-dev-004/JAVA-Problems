package Array.ArrayMedium;
import SortingAlgorithm.Swap;

//Given an array consisting of only 0s, 1s, and 2s.
//Write a program to in-place sort the array without using inbuilt sort functions.
//        ( Expected: Single pass-O(N) and constant space)
//Input: nums = [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2]
//
//Input: nums = [2,0,1]
//Output: [0,1,2]

public class SortArray0s1s2s {
    public int[] output(int[] arr){
        int low = 0, mid = 0;
        int high = arr.length-1;

        while(mid <= high){
            if(arr[mid] == 2) {
                Swap.swap(arr, mid, high);
                high--;
            }
            else if (arr[mid] == 1)
                mid++;
            else {
                Swap.swap(arr,mid,low);
                low++;
                mid++;
            }
        }
        return arr;
    }
}
