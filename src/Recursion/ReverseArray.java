package Recursion;

import java.util.List;

public class ReverseArray {
    private void reverseArray(List<Integer> list, int start, int end){
        if(start > end) return;
        swap(list, start, end);
        reverseArray(list, start+1, end-1);
    }
    private void swap(List<Integer> l, int a, int b){
        int temp = l.get(a);
        l.set(a, l.get(b));
        l.set(b,temp);
    }
    public void output(List<Integer> l, int start, int end){
        reverseArray(l, start, end);
        System.out.println("Reversed array : " + l);
    }
}
