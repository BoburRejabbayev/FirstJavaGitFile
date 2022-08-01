package Classes;

public class ArrayInvert {
    public static void invert(int[] arr) {
        for(int i =0; i< arr.length/2; i++){
            int tmp = arr[i];
            arr[i] = arr[arr.length -i -1];
            arr[arr.length -i -1] = tmp;
        }
//        System.out.println(" ");
    }
}
