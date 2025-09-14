package BinarySearch.BS_1D;
//Problem Statement: You are given a sorted array arr of distinct values and a target value x.
//You need to search for the index of the target value in the array.
//If the value is present in the array, then return its index. Otherwise, determine the index where it
//would be inserted in the array while maintaining the sorted order.
//Input Format:
//      arr[] = {1,2,4,7}, x = 6
//      Result: 3
//      Explanation: 6 is not present in the array. So, if we will insert 6 in the 3rd index(0-based indexing), the array will still be sorted. {1,2,4,6,7}.
public class SearchIndex {
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
