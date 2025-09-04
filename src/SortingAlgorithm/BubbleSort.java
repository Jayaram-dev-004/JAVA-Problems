package SortingAlgorithm;

public class BubbleSort {
    public int[] sort(int[] arr){

        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[i])
                    Swap.swap(arr, i, j);
            }
        }
        return arr;
    }
}

// TC : O(n2)
