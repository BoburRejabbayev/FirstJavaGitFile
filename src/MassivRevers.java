import java.util.Arrays;

public class MassivRevers {
    public static void main(String[] args) {
//        int[] arr = {0,1,2,3,4,5,6};
        revers(new int[]{});
        revers(new int[]{0,1});
        revers(new int[]{0,1,2});
        revers(new int[]{0,1,2,3,4,5,6,7,8,9});
    }

    private static void revers(int[] arr) {
        System.out.print("The revers array " + Arrays.toString(arr) + " => " );
        for (int i = 0; i< arr.length/2; i++){
                int x = arr[i];
                arr[i] = arr[arr.length -i -1];
                arr[arr.length -i -1] = x;
        }
        System.out.println(Arrays.toString(arr));
//
    }
}
