package Array.ArrayMedium;
//Problem Statement: Given a matrix if an element in the matrix is 0 then you will
//have to set its entire column and row to 0 and then return the matrix.
//
//Examples 1:
//
//Input: matrix=[[1,1,1], Output: [[1,0,1],
//               [1,0,1],          [0,0,0],
//               [1,1,1]]          [1,0,1]]
//Explanation: Since matrix[2][2]=0. Therefore, the 2nd column and 2nd row wil be set to 0.
import java.util.ArrayList;
// HINT:

// 1st row and 1st column of the given matrix to keep a track of the cells that need to be marked with 0. But here comes a problem.
// If we try to use the 1st row and 1st column to serve the purpose, the cell matrix[0][0] is taken twice.

public class SetZeroMatrix {
    public void output(ArrayList<ArrayList<Integer>> arr){

        int col0 = 1;
        int m = arr.size();
        int n = arr.get(0).size();

        // set the first row and col to 0
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

                if(arr.get(i).get(j) == 0){
                    arr.get(i).set(0,0);


                if(j != 0)
                    arr.get(0).set(j,0);
                else
                    col0 = 0;
                }
            }
        }

        for(int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(arr.get(i).get(j) != 0) {
                    if (arr.get(0).get(j) == 0 || arr.get(i).get(0) == 0)
                        arr.get(i).set(j, 0);
                }
            }
        }

        if(arr.get(0).get(0) == 0){
            for(int i = 0; i < n; i++){
                arr.get(0).set(i,0);
            }
        }

        if(col0 == 0){
            for(int i = 0; i < m; i++){
                arr.get(i).set(0,0);
            }
        }
    }
}

























