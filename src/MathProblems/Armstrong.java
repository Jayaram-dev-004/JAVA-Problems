package MathProblems;

public class Armstrong {
    public static boolean isArmstrong(int n){
        int num = n;
        int res = 0;
        while(num != 0){
            int rem = num % 10;
            res = (int) Math.pow(rem,3) + res;
            num /= 10;
        }
        System.out.println("Is Armstrong : " + (n == res));
        return n == res;
    }
}
