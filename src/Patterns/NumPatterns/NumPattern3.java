package Patterns.NumPatterns;

public class NumPattern3 {
    public static void numPattern3(int n){
        for(int i = 0; i < 2*n-1; i++){
            // First half
            for(int j = 0; j < (2*n-1)/2 + 1 ; j++){
                System.out.print(n-i);
            }

            // Second half
            for(int j = 0; j < (2*n-1)/2 ; j++){

            }
        }
    }
}

// 4 4 4 4   4 4 4
// 4 3 3 3   3 3 4
// 4 3 2 2   2 3 4
// 4 3 2 1   2 3 4
// 4 3 2 2   2 3 4
// 4 3 3 3   3 3 4
// 4 4 4 4   4 4 4