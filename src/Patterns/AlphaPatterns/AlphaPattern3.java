package Patterns.AlphaPatterns;

public class AlphaPattern3 {
    public static void alphaPattern3(int n) {
        for(int i = 0; i < n; i++){
            // prefix spacing
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            //content 1
            for(int j = 0; j < ((2*i))/2 + 1; j++){
                System.out.print((char)('A' + j));
                //    A
                //   AB
                //  ABC
                // ABCD
            }
            //content 2
            for(int j = 0; j < ((2*i))/2; j++){
                System.out.print((char)('A' + i-j-1));
                //
                // A
                // BA
                // CBA
            }
            System.out.println();
        }
    }
}


//    A
//   ABA
//  ABCBA
// ABCDCBA