package arrays;

public class MaxArr {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 6, 1, 2 };
        int max = arr[0];                       //start me first ele ko max man liya
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);                //final max output
    }
}
