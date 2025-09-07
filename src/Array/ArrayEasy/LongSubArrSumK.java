package Array.ArrayEasy;
//Problem Statement: Given an array and a sum k,we need to print the
//                      length of the longest subarray that sums to k.
//Example 1:
//Input Format: target = 5, array[] = {2,3,5}
//Result: 2
//Explanation: The longest subarray with sum 5 is {2, 3}.
//              And its length is 2.
public class LongSubArrSumK {
    public int output(int[] arr, int target){

        int maxLen = 0,len = 0;
        int sum = 0;
        int i = 0,j = 0;

        while(i < arr.length && j < arr.length){
            sum += arr[j];
            len++;
            if(sum >= target) {
                if(target == sum){
                    maxLen = Math.max(maxLen,len);
                }
                i++;
                len = 0;
                sum = 0;
                j = i;
                continue;
            }
            j++;
        }
        return maxLen;
    }
}
