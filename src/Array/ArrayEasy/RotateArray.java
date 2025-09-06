package Array.ArrayEasy;

//Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.
//
// Examples:
//
//Example 1:
//Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
//Output: 6 7 1 2 3 4 5
//Explanation: array is rotated to right by 2 position .
//
//Example 2:
//Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left
//Output: 9 10 11 3 7 8
//Explanation: Array is rotated to right by 3 position.

import SortingAlgorithm.Swap;

public class RotateArray {
    public int[] output(int[] arr, int times, String rotate) {

        int n = arr.length;

        if ("left".equalsIgnoreCase(rotate)) {
                Reverse(arr, 0, times-1);
                Reverse(arr, times, n-1);
                Reverse(arr, 0, n-1);

        }
        else if ("right".equalsIgnoreCase(rotate)) {
            Reverse(arr,n-times,n-1);
            Reverse(arr, 0,n-times-1);
            Reverse(arr, 0, n-1);
        }
        return arr;
    }

    public void Reverse(int[] arr, int start, int end) {
        while (start <= end) {
            Swap.swap(arr, start, end);
            start++;
            end--;
        }
    }
}
