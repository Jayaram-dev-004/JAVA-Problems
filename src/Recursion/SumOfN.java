package Recursion;

public class SumOfN {
    public int sumOfN(int n){
        if(n == 1) return 1;
        return n + sumOfN(n-1);
    }
    public void output(int n){
        System.out.println(sumOfN(n));
    }
}
