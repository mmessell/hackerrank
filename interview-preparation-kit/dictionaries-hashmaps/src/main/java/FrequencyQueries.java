import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class FrequencyQueries {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        List<Integer> output = new ArrayList<>();
        Map<Integer, Integer> frequency = new HashMap<>();
        Map<Integer, Set<Integer>> reverseFrequency = new HashMap<>();

        for (List<Integer> query : queries) {
            int operation = query.get(0);
            int value = query.get(1);

            if (operation == 1) {
                handleOperation1(frequency, reverseFrequency, value);
            } else if (operation == 2) {
                handleOperation2(frequency, reverseFrequency, value);
            } else if (operation == 3) {
                handleOperation3(output, reverseFrequency, value);
            }
        }

        return output;
    }

    private static void handleOperation1(Map<Integer, Integer> frequency, Map<Integer, Set<Integer>> reverseFrequency, int key) {
        boolean containsKey = frequency.containsKey(key);
        Integer currentValue = containsKey ? frequency.get(key) : 0;
        Integer newValue = containsKey ? currentValue + 1 : 1;

        frequency.put(key, newValue);
        addReversely(reverseFrequency, key, currentValue, newValue);
    }

    private static void handleOperation2(Map<Integer, Integer> frequency, Map<Integer, Set<Integer>> reverseFrequency, int key) {
        if (frequency.containsKey(key)) {
            Integer currentValue = frequency.get(key);
            Integer newValue = currentValue - 1;

            frequency.put(key, newValue);
            frequency.remove(key, 0);
            addReversely(reverseFrequency, key, currentValue, newValue);
        }
    }

    private static void handleOperation3(List<Integer> output, Map<Integer, Set<Integer>> reverseFrequency, int value) {
        Set<Integer> keys = reverseFrequency.get(value);
        output.add(keys != null && !keys.isEmpty() ? 1 : 0);
    }

    private static void addReversely(Map<Integer, Set<Integer>> reverseData, int key, int currentValue, int newValue) {
        if (reverseData.containsKey(currentValue)) {
            reverseData.get(currentValue).remove(key);
        }

        if (reverseData.containsKey(newValue)) {
            reverseData.get(newValue).add(key);
        } else {
            reverseData.put(newValue, new HashSet<Integer>() {{
                add(key);
            }});
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> ans = freqQuery(queries);

        bufferedWriter.write(
                ans.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
