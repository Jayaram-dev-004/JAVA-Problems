package Array.ArrayEasy;

public class RemoveDuplicate {
    public int output(int[] arr){

        int n = arr.length;
        if(arr.length == 0 || arr.length == 1) return n;
        int count = 0;
        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i-1])
                count++;
        }
        return count+1;
    }
}
