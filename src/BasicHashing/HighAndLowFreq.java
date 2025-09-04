package BasicHashing;

import java.util.HashMap;
import java.util.Map;

//Problem Statement: Given an array of size N. Find the highest and lowest frequency element.

//Example 1:
//Input: array[] = {10,5,10,15,10,5};
//Output: 10 15
//Explanation: The frequency of 10 is 3, i.e. the highest and the frequency of 15 is 1 i.e. the lowest.

public class HighAndLowFreq {
    public String highAndLowFreq(int [] arr){
        HashMap<Integer, Integer> hash ;

        hash = new Freq().freq(arr);

        for(int i : arr){
            hash.put(i, hash.getOrDefault(i,0)+1);
        }

        int maxKey = 0;
        int maxVal = Integer.MIN_VALUE;
        int minKey = 0;
        int minVal = Integer.MAX_VALUE;

        for(Map.Entry<Integer, Integer> map : hash.entrySet()){
            if(maxVal < map.getValue()){
                maxKey = map.getKey();
                maxVal = map.getValue();
            }
            if(minVal > map.getValue()){
                minKey = map.getKey();
                minVal = map.getValue();
            }

        }
        return ("Max Value : "+maxKey + " and Min value " + minKey);
    }

    public void output(int[] arr){
        System.out.println(highAndLowFreq(arr));
    }
}
