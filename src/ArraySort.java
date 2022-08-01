package Classes;

import java.util.Arrays;

public class ArraySort {
    public static void sort(int[] arr) {
//        long[] arr = {9,4,7,1,0};
        for (int  i =0; i< arr.length-1; i++){
            for (int j = arr.length-1; j>i; j--){
                if (arr[j-1]<arr[j]){
                    int x = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = x;
                }
            }
        }
//        System.out.println(Arrays.toString(arr));
    }
}
