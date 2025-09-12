package Array.ArrayHard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementNby3 {
    public List<Integer> output(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> i : map.entrySet()){
            int ele = i.getValue();
            System.out.println(i.getKey() + " " + ele);
            if(ele > n/3)
                res.add(i.getKey());
        }
        if(res.isEmpty()) {
            res.add(0);
        }
        return res;
    }
}
