package Array.ArrayMedium;
//Problem Statement: You are given an array of ‘N’ integers. You need to find the length of the longest
// sequence which contains the consecutive elements.

//Example 1:

//Input: [100, 200, 1, 3, 2, 4]
//Output: 4
//Explanation: The longest consecutive subsequence is 1, 2, 3, and 4.

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveInArray {
    public int output(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        int maxLen = 1;
        int count;
        for (int j : arr) {
            count = 1;
            int element = j;
            while (set.contains(element - 1)) {
                count++;
                element -= 1;
            }
            maxLen = Math.max(maxLen, count);
        }
        return maxLen;
    }
}
