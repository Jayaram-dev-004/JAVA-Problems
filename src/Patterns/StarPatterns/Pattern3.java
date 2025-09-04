package Patterns.StarPatterns;

public class Pattern3{
    public static void pattern3(int n){
        for(int i = 0; i < n; i++){
            //prefix spacing
            for(int i1 = 0 ; i1 < n-i-1; i1++)
                System.out.print(" ");

            //Pattern content
            for(int i2 = 0; i2 < 2*i+1; i2++)
                System.out.print("*");

            //suffix spacing - It is not mandatory
//            for(int i1 = 0 ; i1 < n-i-1; i1++)
//                System.out.print(" ");

            System.out.println();
        }
    }
}

//     *
//    ***
//   *****
//  *******
// *********