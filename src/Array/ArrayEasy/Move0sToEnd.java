package Array.ArrayEasy;

import SortingAlgorithm.Swap;

//Problem Statement: You are given an array of integers, your task is to move all the zeros in the array to the
// end of the array and move non-negative integers to the front by maintaining their order.

//Example 1:
//Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
//Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
//Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

public class Move0sToEnd {
    public int [] output(int[] arr){

        int j = 0;
        while(j < arr.length){
            if(arr[j] == 0)
                break;
            j++;
        }
        if(j == 0) return arr;

        for(int i = j+1; i < arr.length; i++){
            if(arr[i] != 0){
                Swap.swap(arr, i, j);
                j++;
            }
        }

        return arr;
    }
}
