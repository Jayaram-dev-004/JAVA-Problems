package Recursion;

public class Fibonacci {
    public int fib (int n){
        if(n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }

    public void output(int i) {
        System.out.println(fib(i));
    }
}
