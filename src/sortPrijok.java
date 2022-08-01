import java.util.Arrays;

public class sortPrijok {
    public static void main(String[] args) {
        int array[] = {9,8,1,4,2,9,8,7,2,4};
        int elementToSearch = 7;
        int jumpStep = (int) Math.sqrt(array.length);
        int previousStep = 0;
        int arrayLength = array.length;
//        int jumpStep = (int) Math.sqrt(array.length);
//        int previousStep = 0;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        outer:
        for (int i = 0; i<arrayLength; i++){
            if(array[i] != elementToSearch  ){
                System.out.println(elementToSearch + " Ne Naydeno");
                return;
//                break outer;
            }
        }

        while (array[Math.min(jumpStep, arrayLength) - 1] < elementToSearch) {
            previousStep = jumpStep;
            jumpStep += (int) (Math.sqrt(arrayLength));
            if (previousStep >= arrayLength) {
                System.out.println(jumpStep);
            }
        }
        while (array[previousStep] < elementToSearch) {
            previousStep++;
            if (previousStep == Math.min(jumpStep, arrayLength)) {
                System.out.println(jumpStep);

            }
        }

        if (array[previousStep] == elementToSearch) {
            System.out.println(previousStep);

        }

    }
}
