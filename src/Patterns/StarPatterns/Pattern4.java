package Patterns.StarPatterns;

public class Pattern4{
    public static void pattern4(int n){
        for(int i = 0; i < n; i++){
            // prefix spacing
            for(int i1 = 0; i1 < i; i1++)
                System.out.print(" ");

            // Character content
            for(int i2 = 0; i2 < 2*(n-i)-1; i2++)
                System.out.print("*");

//            suffix spacing - It is not mandatory
//            for(int i3 = 0; i3 < i; i3++)
//                System.out.print(" ");

            System.out.println();
        }
    }
}

// *******
//  *****
//   ***
//    *