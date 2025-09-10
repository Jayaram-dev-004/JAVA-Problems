package Array.ArrayMedium;


import SortingAlgorithm.Swap;

import java.util.ArrayList;
import java.util.List;

//Problem Statement: Given an array, print all the elements which are leaders. A Leader is an element that is greater than all of the
//elements on its right side in the array.

//arr = [4, 7, 1, 0]
//Output:
//        7 1 0
public class LeaderInArray {
    public List<Integer> output(int[] arr){

        int n = arr.length;
        int max = arr[n-1];

        List<Integer> ans = new ArrayList<>();
        ans.add(max);
        for(int i = n-2; i >= 0; i--){

            if(arr[i] > max){
                max = arr[i];
                ans.add(max);
            }
        }
        reverseArr(ans,0,ans.size()-1);
        return ans;
    }

    public void reverseArr(List<Integer> arr, int i, int j){
        while(i < j){
            Integer temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
    }
}

