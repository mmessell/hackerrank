import java.util.Scanner;


public class SortingBubbleSort {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int[] output = countSwapsHelper(a);
        System.out.println("Array is sorted in " + output[0] + " swaps.");
        System.out.println("First Element: " + output[1]);
        System.out.println("Last Element: " + output[2]);
    }

    public static int[] countSwapsHelper(int[] a) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 -i; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                    count++;
                }
            }
        }

        return a.length == 0
                ? new int[]{count, 0, 0}
                : new int[]{count, a[0], a[a.length - 1]};
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}
