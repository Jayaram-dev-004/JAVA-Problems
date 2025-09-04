package Patterns.StarPatterns;

public class Pattern7 {
    public static void pattern7(int n){
        for (int i = 0; i < n; i++){
            // before spacing
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            // spacing
            for (int j = 0; j < 2*(n-i)-2; j++){
                System.out.print(" ");
            }
            // after spacing
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// *        *
// **      **
// ***    ***
// ****  ****
// **********