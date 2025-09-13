package Array.ArrayHard;
//Problem statement: Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order.
//Merge them in sorted order.Modify arr1 so that it contains the first N elements and modify arr2 so that it contains the last M elements.

//long[] arr1 = {1, 4, 8, 10};
//long[] arr2 = {2, 3, 9};
//Output:
    //arr1[] = [1 2 3 4]
    //arr2[] = [8 9 10]
    //Explanation:
    //After merging the two non-decreasing arrays, we get, 1,2,3,4,8,9,10.
public class MergeTwoSortedArrays {
    public void output(int[] a, int[] b){

        int n = a.length, m = b.length;
        int len = n + m;

        int gap = (len)/2 + (len)%2;

        while(gap > 0){

            int i = 0;
            int j = gap;

            while(j < len){

                // i in array a && j in array b
                if(i < n && j >= n)
                    swapTwoArray(a,b,i,j-n);
                // Both are in array b
                else if (i >= n)
                    swapTwoArray(b,b,i-n, j-n);
                // Both are in array a
                else
                    swapTwoArray(a, a, i, j);

                i++; j++;
            }
            if(gap == 1) break;
            gap = gap/2 + gap % 2;
        }
    }

    public void swapTwoArray(int[] a, int[] b, int ind1, int ind2){
        if(a[ind1] > b[ind2]) {
            int temp = a[ind1];
            a[ind1] = b[ind2];
            b[ind2] = temp;
        }
    }
}
