import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {

    // Complete the repeatedString function below.
    public static long repeatedString(String s, long n) {
        if (s.length() == 0 || n == 0)
            return 0;

        long wholeRepeats = n / s.length();
        long wholeCount = countChar(s, 'a') * wholeRepeats;

        long substringIndex = n - wholeRepeats * s.length();
        long subCount = countChar(s.substring(0, (int) substringIndex), 'a');

        return wholeCount + subCount;
    }

    private static long countChar(String s, char c) {
        return s.chars().filter(ch -> ch == c).count();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
