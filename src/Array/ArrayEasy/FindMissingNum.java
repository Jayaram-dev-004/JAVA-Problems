package Array.ArrayEasy;
//Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N.
// Find the number(between 1 to N), that is not present in the given array.

//Example 1:
//Input Format: N = 5, array[] = {1,2,4,5}
//Result: 3
//Explanation: In the given array, number 3 is missing. So, 3 is the answer.

public class FindMissingNum {
    public int output(int[] arr){


        for(int i = 1 ; i <= arr.length; i++){
            if(arr[i-1] != i)
                return i;
        }
        return 0;

//        int xor1 = 0;
//        int xor2 = 0;
//        for(int i = 0; i < arr.length-1; i++){
//            xor2 = xor2 ^ arr[i]; // XOR of array elements
//            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
//        }
//        xor1 ^= (arr.length);
//
//        return( xor1 ^ xor2 );
    }
}
