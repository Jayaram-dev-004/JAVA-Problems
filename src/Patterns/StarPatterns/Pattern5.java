package Patterns.StarPatterns;

public class Pattern5{
    public static void pattern5(int n)
    {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == n-1 || i == 0 || j == 0 || j == n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

// ******
// *    *
// *    *
// *    *
// *    *
// ******