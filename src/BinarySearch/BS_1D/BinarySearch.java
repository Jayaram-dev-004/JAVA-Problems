package BinarySearch.BS_1D;

public class BinarySearch {
    public int bs(int[] arr, int target){

        int l = 0;
        int r = arr.length-1;

        while(r >= l){
            int mid = (l+r)/2;
            if(arr[mid]==target)
                return mid;
            else if (arr[mid] > target)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }
}
