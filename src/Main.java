import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(findMinimum(n, arr));
    }

    public static int findMinimum(int n, int[] arr) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], findMinimum(n - 1, arr));
    }
}

/**
 * This method finds the minimum element in an array.
 * It uses a recursive approach.
 *
 * Time complexity: O(n), where n is the number of elements in the array.
 * The recursive algorithm compares each element with the minimum of the remaining elements,
 * resulting in linear time complexity.
 *
 * Space complexity: O(n) due to recursive calls stored on the call stack.
 *
 * @param n The number of elements in the array.
 * @param arr The array from which the minimum value is to be found.
 * @return The minimum element in the given array.
 */
