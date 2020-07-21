import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JumpingOnTheClouds {

    // Complete the jumpingOnClouds function below.
    public static int jumpingOnClouds(int[] c) {
        int numberOfJumps = 0;
        int index = 0;

        while (index < c.length - 1) {
            int jumpOneIndex = index + 1;
            int jumpTwoIndex = index + 2;

            if (isCloudSafe(c, jumpTwoIndex)) {
                index = jumpTwoIndex;
            } else if (isCloudSafe(c, jumpOneIndex)) {
                index = jumpOneIndex;
            }

            numberOfJumps++;
        }

        return numberOfJumps;
    }

    static boolean isCloudSafe(int[] c, int index) {
        return index < c.length && c[index] != 1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
