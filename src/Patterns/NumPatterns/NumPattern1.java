package Patterns.NumPatterns;

public class NumPattern1 {
    public static void numPattern1(int n){
        for(int i = 0; i < n; i++){
            int res = (i % 2 == 0) ? 1 : 0;
            for(int j = 0; j <= i; j++){
                System.out.print(res+ " ");
                res = (res == 1) ? 0 : 1;
            }
            System.out.println();
        }
    }
}

// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1