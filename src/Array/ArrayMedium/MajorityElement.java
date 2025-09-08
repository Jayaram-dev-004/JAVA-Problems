package Array.ArrayMedium;
//Problem Statement: Given an array of N integers, write a program to return an element that occurs more than N/2 times in the given array.
//                  You may consider that such an element always exists in the array.
//
//Example:
//Input Format: N = 3, nums[] = {3,2,3}
//Result: 3
//Explanation: When we just count the occurrences of each number and
//                compare with half of the size of the array, you will get 3 for the above solution.


public class MajorityElement {
    public int output(int[] arr){
        int element = arr[0];
        int count = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == element){
                count++;
            }
            else{
                if(count == 0){
                    element = arr[i];
                    count++;
                }
                count--;
            }
        }
        return element;
    }
}
