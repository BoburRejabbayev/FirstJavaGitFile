import java.util.Arrays;

public class sort_DvoichniyWhile {
    public static void main(String[] args) {
//        int[] array = {9,8,1,4,2,9,8,7,2,4};
        position(new int[] {9,8,1,4,2,9,8,7,2,4});
    }

    private static void position(int[] array) {
        int elementToSearch = 7;
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        String str = "";

        for (int i = 0; i<array.length; i++){
            if(array[i] == elementToSearch  ){
                System.out.println(i);
                return;
//                str = "";
            }
            else str= "ne nayneno";
        }
        System.out.println(str);

//        // условие прекращения (элемент не представлен)
//        while (firstIndex <= lastIndex) {
//            int middleIndex = (firstIndex + lastIndex) / 2;
//            // если средний элемент - целевой элемент, вернуть его индекс
//            if (array[middleIndex] == elementToSearch) {
//                System.out.println(middleIndex); break;
//            }
//
//            // если средний элемент меньше
//            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
//            else if (array[middleIndex] < elementToSearch) {
//                firstIndex = middleIndex + 1;
//                System.out.println(firstIndex);break;
//            }
//            // если средний элемент больше
//            // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
//            else if (array[middleIndex] > elementToSearch) {
//                lastIndex = middleIndex - 1;
//                System.out.println(lastIndex);break;
//            }
//        }
    }
}
