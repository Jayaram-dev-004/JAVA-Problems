package Array.ArrayHard;

public class PascalTriangle {

    private int[][] arr;

    public void output(int n){
        arr = new int[n][n];
        for(int i = 1; i <= n; i++){
            arr[i-1] = getRow(i);
            
//            for(int j = 0; j <=i; j++){
//                if(i == j || j == 0) arr[i][j] = 1;
//                else{
//                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
//                }
//            }
        }
    }

    public int[] getRow(int r){
        int[] retRow = new int[r];

        retRow[0] = 1;
        for(int i = 2; i <= r; i++){
            retRow[i-1] =(int) getOneElement(r, i);
        }
        retRow[r-1] = 1;

        return retRow;
    }

    public long getOneElement(int r, int c){
        r -= 1;
        c -= 1;
        long res = 1;
        for(int i = 0; i < c; i++){
            res *= (r-i);
            res /= (i+1);
        }
        return res;
    }

    public void printPascalArr(int n){
        output(n);
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }





}
