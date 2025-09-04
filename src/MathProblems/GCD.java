package MathProblems;

public class GCD {
    public static int gcd(int a, int b) {
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        while(min != 0){
            int temp = min;
            min = max % min;
            max = temp;
        }
        System.out.println("GCD :" + max);
        return max;
    }

//    The Euclidean Algorithm
//    Eg, n1 = 20, n2 = 15:
//
//    gcd(20, 15) = gcd(20-15, 15) = gcd(5, 15)
//
//    gcd(5, 15) = gcd(15-5, 5) = gcd(10, 5)
//
//    gcd(10, 5) = gcd(10-5, 5) = gcd(5, 5)
//
//    gcd(5, 5) = gcd(5-5, 5) = gcd(0, 5)
//
//    Hence, return 5 as the gcd.

    public static int gcd1(int a, int b) {
        while(a > 0 && b > 0) {
            if(a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if(a == 0) {
            System.out.println("GCD : "+ b);
            return b;
        }
        System.out.println("GCD : "+a);
        return a;
    }
}
