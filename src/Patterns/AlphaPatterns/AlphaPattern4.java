package Patterns.AlphaPatterns;

public class AlphaPattern4 {
    public static void alphaPattern4(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print((char)('A' + n+j-i-1));
            }
            System.out.println();
        }
    }
}

// E
// D E
// C D E
// B C D E
// A B C D E