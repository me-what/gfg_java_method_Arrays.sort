import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");


        int[] arr2 = { 13, 7, 6, 45, 21, 9, 101, 102 };
        Arrays.sort(arr2);
        System.out.println("Modified arr[] : "
                + Arrays.toString(arr2)+"\n");


        int[] arr3 = { 13, 7, 6, 45, 21, 9, 2, 100 };
        Arrays.sort(arr3, 1, 5);
        System.out.println("Modified arr[] : "
                + Arrays.toString(arr3)+"\n");


        Integer[] arr4 = { 13, 7, 6, 45, 21, 9, 2, 100 };
        Arrays.sort(arr4, Collections.reverseOrder());
        System.out.println("Modified arr[] : "
                + Arrays.toString(arr4)+"\n");


        String arr5[] = { "practice.geeksforgeeks.org",
                "www.geeksforgeeks.org",
                "code.geeksforgeeks.org" };
        Arrays.sort(arr5);
        System.out.println("Modified arr[] : "
                + Arrays.toString(arr5));

        Arrays.sort(arr5, Collections.reverseOrder());

        System.out.println("Modified arr[] :"
                + Arrays.toString(arr5)+"\n");


        Integer[] array
                = { 99, 12, -8, 12, 34, 110, 0, 121, 66, -110 };
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(
                "Array in descending order: "
                        + Arrays.toString(array));
    }
}