import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArrayManipulation {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long arr[] = new long[n];

        for (int i = 0; i < queries.length; i++) {
            prefixSum(queries[i], arr);
        }

        return getMax(arr);
    }

    private static void prefixSum(int[] query, long[] arr) {
        int a = query[0] - 1;
        int b = query[1];
        int k = query[2];

        arr[a] += k;

        if (b < arr.length) {
            arr[b] -= k;
        }
    }

    private static long getMax(long[] arr) {
        long sum = 0;
        long max = 0;

        for (long l : arr) {
            sum += l;
            max = Math.max(max, sum);
        }

        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
