package Array.ArrayHard;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//Problem Statement: Given an array of intervals, merge all the overlapping intervals
//and return an array of non-overlapping intervals.

//Example:
//
//Input: intervals=[[1,3],[2,6],[8,10],[15,18]]
//Output: [[1,6],[8,10],[15,18]]
//Explanation: Since intervals [1,3] and [2,6] are overlapping we can merge them to form [1,6]
//intervals.


public class MergeOverLappingsubIntervals {
    public List<List<Integer>> output(int[][] arr){

        int n = arr.length;
        Arrays.sort(arr, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0] - b[0];
            }
        });

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int size = res.size()-1;

            // if the current interval does not
            // lie in the last interval:
            if(res.isEmpty() || res.get(size).get(1) < arr[i][0]){
                res.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
            // if the current interval
            // lies in the last interval:
            else{
                int intervalOneEnd = res.get(size).get(1);
                int intervalTwoEnd = arr[i][1];
                int maxOfTwoInterval = Math.max(intervalOneEnd, intervalTwoEnd);
                res.get(size).set(1, maxOfTwoInterval);
            }
        }
        int size = res.size();

        int[][] r = new int[size][2 ];
        for(int i = 0; i < size; i++) {
            r[i][0] = res.get(i).get(0);
            r[i][1] = res.get(i).get(1);
        }
        return res;
    }
}
