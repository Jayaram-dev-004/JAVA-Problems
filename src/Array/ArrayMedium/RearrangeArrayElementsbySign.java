package Array.ArrayMedium;

public class RearrangeArrayElementsbySign {
    public void output(int[] arr){
        int i = 0;
        int j = 0;
        while(i < arr.length){
            if(arr[i] < 0) {
                j = i;
                break;
            }
            i++;
        }
        i = 1;

        while(i < j){
            int k = j;
            int temp = arr[k];
            while(k > i) {
                arr[k] = arr[k-1];
                k--;
            }
            arr[i] = temp;
            i += 2;
            j += 1;
        }
    }
}
