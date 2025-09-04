package Recursion;

public class PrintNToOne {
    public void printNToOne(int n){
        if(n <= 0) return;
        System.out.println(n);
        printNToOne(n-1);
    }
}
