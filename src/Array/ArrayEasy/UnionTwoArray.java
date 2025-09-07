package Array.ArrayEasy;
//Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.
//
// The union of two arrays can be defined as the common and distinct elements in the two arrays.
// NOTE: Elements in the union should be in ascending order.

// EXAMPLE :
// arr1[] = {1,2,3,4,5,6,7,8,9,10}
// arr2[] = {2,3,4,4,5,11,12}
// Output: {1,2,3,4,5,6,7,8,9,10,11,12}

import java.util.ArrayList;
import java.util.List;

public class UnionTwoArray
{
    public List<Integer> output(int[] arr1, int[] arr2)
    {
    ArrayList<Integer> res = new ArrayList<>();

    int m = arr1.length-1;
    int n = arr2.length-1;
    int i = 0, j = 0;

    // Both arr1 and arr2
    while(i < m && j < n){
        if(arr1[i] >= arr2[j]){
            if(res.isEmpty() || res.get(res.size()-1) != arr2[j])
                res.add(arr2[j]);
            j++;
        }
        else{
            if(res.isEmpty() || res.get(res.size()-1) != arr1[i])
                res.add(arr1[i]);
            i++;
        }
    }

    // arr1
    while(j < n){
        if(res.get(res.size()-1) != arr2[j])
            res.add(arr2[j]);
        j++;
    }

    // arr2
    while(i < m){
        if(res.get(res.size()-1) != arr1[i])
            res.add(arr2[i]);
        i++;
    }

    return res;
    }
}
