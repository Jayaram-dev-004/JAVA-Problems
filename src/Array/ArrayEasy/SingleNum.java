package Array.ArrayEasy;
//Problem Statement: Given a non-empty array of integers arr, every element
//                  appears twice except for one. Find that single one.

//Example 1:
//Input Format: arr[] = {2,2,1}
//Result: 1
//Explanation: In this array, only the element 1 appear once and
//              so it is the answer.

public class SingleNum {
    public int output(int[] arr){
        int res = 0;
        for(int i : arr){
            res = res ^ i;
        }
        return res;
    }
}
