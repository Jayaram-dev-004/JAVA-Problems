package Array.ArrayHard;
//Problem Statement: Given an array of integers A and an integer B. Find the
//        total number of subarrays having bitwise XOR of all elements equal to k.

//    Input Format: A = [4, 2, 2, 6, 4] , k = 6
//    Result: 4
//    Explanation: The subarrays having XOR of their elements as 6 are  [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], [6]
import java.util.HashMap;

public class NoOfSubArraysWithXorK {
    public int output(int[] arr, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int xor = 0;
        int countXOR = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];

            int xorK = xor ^ k;

            if(map.containsKey(xorK)){
                countXOR  += map.get(xorK);
            }
            else{
                if(map.containsKey(xor)) {
                    map.put(xor,map.get(xor)+1);
                }
                else
                    map.put(xor,1);
            }
        }
        return countXOR;
    }
}
