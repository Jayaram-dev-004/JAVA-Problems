package Array.ArrayMedium;

//Given an array of integers arr[] and an integer target.
//Return indices of the two numbers such that their sum is equal to
//        the target. Otherwise, we will return {-1, -1}.

//Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
//Result: YES (for 1st variant)
//          [1, 3] (for 2nd variant)
//Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for the first variant and [1, 3] for 2nd variant.

import java.util.HashMap;

public class TwoSum {
   
    public int[] output(int[] arr, int target){
        int[] res = {-1,-1};

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int rem = target - arr[i];
            if(map.containsKey(rem)){
                res[0] = i;
                res[1] = map.get(rem);
            }
            map.put(arr[i],i);
        }



        return res;
    }

}
