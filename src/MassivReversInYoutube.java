package Classes;
import java.util.Arrays;

//import ArrayInvert.invert ;

public class MassivReversInYoutube {
    public static void main(String[] args) {

//        reverse(new int[]{});
//        reverse(new int[]{0,1});
//        reverse(new int[]{0,1,2,3});
//        reverse(new int[]{0,1,2,3,4,5,6,7,8,9});

        int arr[] = {0,1,2,3,4,5,6};
        for(int i =0; i< arr.length/2; i++){
            int tmp = arr[i];
            arr[i] = arr[arr.length -i -1];
            arr[arr.length -i -1] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] array) {
        System.out.print(Arrays.toString(array) + " => ");
        Classes.ArrayInvert.invert(array);
        System.out.println(Arrays.toString(array));
    }
}
