import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FraudulentActivityNotifications {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditures, int days) {
        int notifications = 0;
        boolean even = days % 2 == 0;
        int i1 = days / 2;
        int i2 = i1 + 1;

        int[] historyCount = new int[201];

        for (int today = 0; today < expenditures.length; today++) {

            if (today >= days) {
                int median2;

                if (even) {
                    median2 = calc2MedianEven(getHistoryIndex(historyCount), i1, i2);
                } else {
                    median2 = calc2MedianOdd(getHistoryIndex(historyCount), 0, i2, 2);
                }


                if (expenditures[today] >= median2) {
                    notifications++;
                }
            }

            updateHistory(historyCount, expenditures, today, days);
        }

        return notifications;
    }

    private static int calc2MedianEven(int[] historyIndex, int i1, int i2) {
        int median2 = 0;
        int i = 0;

        for (; i < historyIndex.length; i++) {
            if (i1 <= historyIndex[i]) {
                median2 += i;
                break;
            }
        }

        median2 += calc2MedianOdd(historyIndex, i, i2, 1);

        return median2;
    }

    private static int calc2MedianOdd(int[] historyIndex, int i, int i2, int multiplier) {
        int median2 = 0;

        for (; i < historyIndex.length; i++) {
            if (i2 <= historyIndex[i]) {
                median2 = i * multiplier;
                break;
            }
        }

        return median2;
    }

    private static int[] getHistoryIndex(int[] historyCount) {
        int[] historyIndex = Arrays.copyOfRange(historyCount, 0, historyCount.length);

        for (int i = 1; i < historyIndex.length; i++) {
            historyIndex[i] += historyIndex[i - 1];
        }

        return historyIndex;
    }

    private static void updateHistory(int[] historyCount, int[] expenditures, int today, int days) {
        historyCount[expenditures[today]] += 1;

        if (today >= days) {
            historyCount[expenditures[today - days]] -= 1;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
