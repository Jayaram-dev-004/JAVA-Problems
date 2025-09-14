package BinarySearch.BS_1D;
// Problem Statement: Given a sorted array of N integers and an integer x,
//                    write a program to find the lower bound of x.

// What is Lower Bound?
// The lower bound algorithm finds the first or the smallest index in a sorted array
// where the value at that index is greater than or equal to a given key i.e. x.

//Input Format: N = 4, arr[] = {1,2,2,3}, x = 2
//Result: 1
//Explanation: Index 1 is the smallest index such that arr[1] >= x.

public class LowerBound {
    public int output(int[] arr, int x){

        int l = 0;
        int r = arr.length-1;
        int ans = r+1;

        while (r >= l) {
            int mid = (l+r)/2;
             if(arr[mid] >= x){
                 ans = mid;
                 r = mid - 1;
             }
             else
                 l = mid + 1;
        }
        return ans;
    }
}
