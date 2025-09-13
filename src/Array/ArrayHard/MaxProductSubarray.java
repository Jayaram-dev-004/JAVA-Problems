package Array.ArrayHard;
//Problem Statement: Given an array that contains both negative and
//                  positive integers, find the maximum product subarray.

//Example 1:
//Input:
//Nums = [1,2,-3,0,-4,-5]
//Output: 20
//Explanation: In the given array, we can see (-4)×(-5) gives maximum product value.

public class MaxProductSubarray {
    public int output(int[] arr) {

        int n = arr.length;
        int maxProd = Integer.MIN_VALUE;

        int prefixProd = 1;
        int suffixProd = 1;

        for(int i = 0; i < arr.length; i++){
            if(prefixProd == 0) prefixProd = 1;
            if(suffixProd == 0) suffixProd = 1;

            prefixProd *= arr[i];
            suffixProd *= arr[n-i-1];

            maxProd = Math.max(maxProd, Math.max(prefixProd, suffixProd));

        }
        return maxProd;
    }
}
