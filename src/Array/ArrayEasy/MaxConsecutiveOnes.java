package Array.ArrayEasy;
//Problem Statement: Given an array that contains only 1 and 0
//                      return the count of maximum consecutive ones in the array.
//
//Example 1:
//
//Input: prices = {1, 1, 0, 1, 1, 1}
//Output: 3
//Explanation: There are two consecutive 1’s and three consecutive 1’s in
//                  the array out of which maximum is 3.

public class MaxConsecutiveOnes {
    public int output(int[] arr){
        int max = 0;
        int curMax = 0;

        for(int i = 0; i < arr.length;i++){
            if(arr[i] == 0){
                max = Math.max(curMax,max);
                curMax = 0;
            }
            else
                curMax++;
        }
        max = Math.max(curMax,max);
        return max;
    }
}
