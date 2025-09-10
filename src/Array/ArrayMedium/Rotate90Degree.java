package Array.ArrayMedium;
// Problem Statement: Given a matrix, your task is to rotate the matrix 90 degrees clockwise.

//Input: [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
//Output:[[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
//Explanation: Rotate the matrix simply by 90 degree clockwise and return the matrix


public class Rotate90Degree {

    public void output(int[][] arr){
        transposeMatrix(arr);
        reverseMatrix(arr);
    }

    private void transposeMatrix(int[][] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                swap2DMatrix(arr,i,j);
            }
        }
    }

    private void reverseMatrix(int[][] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length - 1 - j];
                arr[i][arr.length - 1 - j] = temp;
            }
        }
    }

    private void swap2DMatrix(int[][] arr, int i, int j){
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;

        }
}
