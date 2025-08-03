package java_revamp.day_3;

public class Array_3 {
    public static void main(String[] args) {
        // Example of a simple array
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        System.out.println(arr);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Array length: " + arr.length);
        System.out.println();
    }
}
