import java.util.Scanner;

public class NewYearChaos {

    // Complete the minimumBribes function below.
    public static void minimumBribes(int[] q) {
        int bribes = minimumBribesHelper(q);
        System.out.println(bribes == -1 ? "Too chaotic" : bribes);
    }

    public static int minimumBribesHelper(int[] q) {
        int bribes = 0;

        for (int i = 0; i < q.length; i++) {
            if (isTooChaotic(q, i)) {
                return -1;
            }

            // -1 (0 indexed array,), -1 (min legal position of adjacent index)
            for (int j = Math.max(q[i] - 1 - 1, 0); j < i; j++) {
                if (q[j] > q[i]) {
                    bribes++;
                }
            }
        }

        return bribes;
    }

    private static boolean isTooChaotic(int[] q, int i) {
        int bribe = q[i] - i - 1;
        return bribe > 2;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
