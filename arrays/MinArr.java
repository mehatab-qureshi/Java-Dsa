package arrays;

public class MinArr {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 5, 6, 1, 4 };   //i/p arr
        int min = arr[0];                   //starting me ek ele ko min maan liya
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);            //final min result
    }
}
