package Patterns.NumPatterns;

public class NumPattern2 {
    public static void numPattern2(int n){
        for(int i = 0; i < n; i++){
            // content
            for(int j = 0; j <= i; j++){
                System.out.print(j+1);
            }
            // spacing
            for(int j = 0; j < 2*(n-i)-2; j++){
                System.out.print(" ");
            }
            // content
            for(int j = 0; j <= i; j++){
                System.out.print((i+1)-j);
            }
            System.out.println();
        }
    }
}

// 1      1
// 12    21
// 123  321
// 12344321