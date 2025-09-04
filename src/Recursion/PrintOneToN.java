package Recursion;

public class PrintOneToN {
    public void printOneToN(int n){
        if(n <= 0) return;
        printOneToN(n-1);
        System.out.println(n);
    }

}
