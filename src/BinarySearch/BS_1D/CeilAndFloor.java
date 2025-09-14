package BinarySearch.BS_1D;

//Problem Statement: You're given an sorted array arr of n integers and an integer x. Find the floor and ceiling of x in arr[0..n-1].
//The floor of x is the largest element in the array which is smaller than or equal to x.
//The ceiling of x is the smallest element in the array greater than or equal to x.

//Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 5
//Result: 4 7
//Explanation: The floor of 5 in the array is 4, and the ceiling of 5 in the array is 7.

public class CeilAndFloor {
    public int[] output(int[] arr, int x){

        int l = 0;
        int r = arr.length-1;
        int[] ans = {-1,-1}; // 0 - Floor, 1 - ceil

        while (r >= l) {
            int mid = (l+r)/2;

            if(arr[mid] == x){
                ans[0] = ans[1] = mid;
                break;
            }
            else if(arr[mid] > x) {
                ans[1] = mid;
                r = mid - 1;
            }
            else {
                ans[0] = mid;
                l = mid + 1;
            }
        }
        return ans;
    }
}
