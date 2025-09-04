package Patterns.StarPatterns;

public class Pattern2{
    public static void pattern2(int n) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= n-i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// *****
// ****
// ***
// **
// *