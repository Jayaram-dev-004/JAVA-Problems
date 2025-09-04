package Patterns.StarPatterns;

public class Pattern6{
    public static void pattern6(int n){

        for(int i = 0; i < n; i++){
            // Before spacing
            for(int j = 0; j < n-i; j++){
                System.out.print("*");
            }
            // spacing
            for(int j = 0; j < 2*i; j++){
                System.out.print(" ");
            }
            // After spacing
            for(int j = 0; j < n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// **********
// ****  ****
// ***    ***
// **      **
// *        *

