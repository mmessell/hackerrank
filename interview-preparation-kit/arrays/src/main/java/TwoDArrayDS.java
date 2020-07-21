import java.io.*;
import java.util.*;

public class TwoDArrayDS {

    // Complete the hourglassSum function below.
    public static int hourglassSum(int[][] arr) {
        int hourglassSum = -9*8;
        int numberOfColumns = arr.length;
        int numberOfRows = arr[0].length;

        for (int x = 0; x + 2 < numberOfColumns; x++) {
            for (int y = 0; y + 2 < numberOfRows; y++) {
                hourglassSum = Math.max(hourglassSum, calcHourglassSum(arr, x, y));
            }
        }

        return hourglassSum;
    }

    private static int calcHourglassSum(int[][] arr, int x, int y) {
        return arr[x][y] + arr[x][y + 1] + arr[x][y + 2] +
                arr[x + 1][y + 1] + arr[x + 2][y] +
                arr[x + 2][y + 1] + arr[x + 2][y + 2];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
