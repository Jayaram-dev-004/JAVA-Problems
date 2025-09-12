package Array.ArrayHard;
//Problem Statement: Given an array containing both positive and negative integers, we have to find the length
//        of the longest subarray with the sum of all elements equal to zero.

//    Input Format: N = 6, array[] = {9, -3, 3, -1, 6, -5}
//    Result: 5
//    Explanation: The following subarrays sum to zero:
//    {-3, 3} , {-1, 6, -5}, {-3, 3, -1, 6, -5}
//    Since we require the length of the longest subarray, our answer is 5!
import java.util.HashMap;

public class LongestSubArrayWithSum0 {
    public int output(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum == 0)
                maxSum = i + 1;
            else{
                if(map.get(sum) != null)
                    maxSum = Math.max(maxSum,i - map.get(sum));
// we do not update the index of a sum if it’s seen again because we require the length of the longest subarray
                else
                    map.put(sum,i);
            }
        }
        return maxSum;
    }
}
