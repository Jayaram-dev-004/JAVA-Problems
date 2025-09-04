package Patterns.AlphaPatterns;

public class AlphaPattern2{
    public static void alphaPattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }

    }
}

// ABCDE
// ABCD
// ABC
// AB
// A