public class Main {
    public static void main(String[] args) {
        double[] nums = {10.1, 10.2, 10.3, 10.4, 10.5, 10.6};
        double result = 0;
        for (double d: nums
             ) {
            result +=d;
        }
        System.out.println("Sredyaya arifmetika = " + result/ nums.length );
    }
}