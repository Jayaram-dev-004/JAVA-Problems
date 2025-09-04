package Patterns.AlphaPatterns;

public class AlphaPattern1{
        public static void alphaPattern1(int n){
            for(int i = 0; i < n; i++){
                for(int j = 0; j <= i; j++){
                    System.out.print((char)('A' + j));
                }
                System.out.println();
            }
        }
}

// A
// AB
// ABC
// ABCD
// ABCDE