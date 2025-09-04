package SortingAlgorithm;

public class SelectionSort {

    public int[] sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
          int smallInd = i;
          for(int j = i+1 ; j < arr.length; j++){
              if(arr[smallInd] > arr[j]){
                  smallInd = j;
              }
          }
          Swap.swap(arr, i, smallInd);
        }
        return arr;
    }
}

// TC : O(n2)