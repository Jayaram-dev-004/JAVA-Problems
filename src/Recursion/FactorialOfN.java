package Recursion;

public class FactorialOfN {
    public int factorialOfN(int n){
        if(n == 1) return 1;
        return n * factorialOfN(n-1);
    }
    public void output(int n){
        System.out.println(factorialOfN(n));
    }
}
