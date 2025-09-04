package BasicHashing;
//Problem statement: Given an array, we have found the number of occurrences of each element in the array.

//        Example 1:
//        Input: arr[] = {10,5,10,15,10,5};
//        Output:   10  3
//                  5  2
//                  15  1
//        Explanation: 10 occurs 3 times in the array
//        5 occurs 2 times in the array
//        15 occurs 1 time in the array

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Freq {

    public HashMap<Integer, Integer> freq(int[] arr){
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i : arr){
            hash.put(i,hash.getOrDefault(i,0)+1);
        }
        return hash;
    }

    public List<List<Integer>> countFreq(int[] arr){

        HashMap<Integer, Integer> hash;
        List<List<Integer>> retList = new ArrayList<>();

        hash = freq(arr);

        for(Map.Entry<Integer,Integer> map : hash.entrySet()){
            List<Integer> keyVal = new ArrayList<>();
            keyVal.add(map.getKey());
            keyVal.add(map.getValue());
            retList.add(keyVal);
        }
        return retList;
    }

    public void outputCountFreq(int[] arr){
        System.out.println(countFreq(arr));
    }
    public void outputFreq(int[] arr){
        System.out.println(freq(arr));
    }
}

