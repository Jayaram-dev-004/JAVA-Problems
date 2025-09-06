package Array.ArrayEasy;

//Given an array nums, return true if the array was originally sorted in non-decreasing order,
// then rotated some number of positions (including zero). Otherwise, return false.

// Input: nums = [3,4,5,1,2]
// Output: true
// Explanation: [1,2,3,4,5] is the original sorted array.
// You can rotate the array by x = 2 positions to begin on the element of value 3: [3,4,5,1,2].

public class IsSortedAndRotated {
    public boolean output(int[] arr){
        int n = arr.length;
        int inversionCount = 0;
        for(int i = 1; i < n; i++){
            if(arr[i] < arr[i-1])
                inversionCount++;
        }
        if(arr[0] < arr[n-1])
            inversionCount++;

        return inversionCount <= 1;
    }
}
