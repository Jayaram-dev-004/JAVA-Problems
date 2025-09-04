package MathProblems;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        int num = x;
        int res = 0;

        while(num != 0){
            int rem = num % 10;
            num /= 10;
            res = res*10 + rem;
        }
        boolean out = res == x;
        System.out.println("Is palindrome : "+out);
        return res == x;
    }
}
