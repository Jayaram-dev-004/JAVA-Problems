package Array.ArrayMedium;
//Problem Statement: Given an integer array arr, find the contiguous subarray
//        (containing at least one number) which
//has the largest sum and returns its sum and prints the subarray.

//Input: arr = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.

import java.util.ArrayList;
import java.util.List;

public class MaxSumSubArray {
    public int output(int[] arr){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];

            max = Math.max(sum,max);

            if(sum < 0) sum = 0;
        }
        return max;
    }
    public List<Integer> outputList(int[] arr){
        int sum = 0;
        List<Integer> ans = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        List<Integer> res = null;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            ans.add(arr[i]);

            if(max < sum){
                max = sum;
                 res = new ArrayList<>(ans);
            }

            if(sum < 0) {
                ans.clear();
                sum = 0;
            }
        }
        return res;
    }
}
