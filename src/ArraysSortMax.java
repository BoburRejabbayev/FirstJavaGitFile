package Classes;

import java.util.Arrays;

public class ArraysSortMax {
    public static void main(String[] args) {

        int arr[][] = {
                {},
                {1},
                {9,8,5,1,6,4,2,0,3},
                {9,4,7,1}
        };

        for ( int[] arr1D : arr
             ) {
            System.out.print(Arrays.toString(arr1D) + " => ");
            Classes.ArraySort.sort(arr1D);
            System.out.print(Arrays.toString(arr1D) + " ");
            Arrays.sort(arr1D);
            System.out.println(Arrays.toString(arr1D)+" ");
        }

    }
}
