package Array.ArrayEasy;
//Problem Statement: Given an array, find the second smallest and second largest element in the array.

//Example 1:
//Input: [1,2,4,7,7,5]
//Output:   Second Smallest : 2
//         Second Largest : 5
//Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2
public class SecondLargest {
    public int secLargest(int[] arr){
//        int[] arr = {1,2,3,4,1,2};
        int firLargest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > firLargest) {
                secLargest = firLargest;
                firLargest = j;
            }
            else if(j > secLargest && j != firLargest){
                secLargest = j;
            }
        }
        return secLargest;
    }
}
