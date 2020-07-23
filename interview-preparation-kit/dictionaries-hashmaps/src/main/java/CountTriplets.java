import java.io.*;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class CountTriplets {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
        Map<Long, Long> lookingFor2s = new HashMap<>();
        Map<Long, Long> lookingFor3s = new HashMap<>();
        Long tripletsCount = 0L;

        for (Long l : arr) {
            tripletsCount += lookingFor3s.containsKey(l) ? lookingFor3s.get(l) : 0;

            if (lookingFor2s.containsKey(l)) {
                lookingFor3s.compute(l * r, (key, value) -> value == null ? lookingFor2s.get(l) : value + lookingFor2s.get(l));
            }
            lookingFor2s.compute(l * r, (key, value) -> value == null ? 1 : value + 1);

        }

        return tripletsCount;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nr[0]);

        long r = Long.parseLong(nr[1]);

        List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Long::parseLong)
                .collect(toList());

        long ans = countTriplets(arr, r);

        bufferedWriter.write(String.valueOf(ans));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
