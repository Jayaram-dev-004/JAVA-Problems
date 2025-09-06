package Array.ArrayEasy;

import SortingAlgorithm.Swap;

public class Move0sToEnd {
    public int [] output(int[] arr){

        int j = 0;
        while(j < arr.length){
            if(arr[j] == 0)
                break;
            j++;
        }
        if(j == 0) return arr;

        for(int i = j+1; i < arr.length; i++){
            if(arr[i] != 0){
                Swap.swap(arr, i, j);
                j++;
            }
        }

        return arr;
    }
}
