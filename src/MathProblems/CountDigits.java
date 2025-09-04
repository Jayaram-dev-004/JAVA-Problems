package MathProblems;

public class CountDigits {
    public static int countDigits(int num) {

        int digits = (num == 0) ? 0 : (int) Math.log10(num) + 1;
        System.out.println("Number of digits : "+digits);
        return digits;
    }
}
