import java.util.*;

public class HashTablesRansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        System.out.println(checkMagazineHelper(magazine, note) ? "Yes" : "No");
    }

    static boolean checkMagazineHelper(String[] magazine, String[] note) {
        Map<String, Integer> magazineMap = getMagazineMap(magazine);

        for (String word : note) {
            if (magazineMap.containsKey(word) && magazineMap.get(word) > 0) {
                magazineMap.put(word, magazineMap.get(word) -1);
            } else {
                return false;
            }
        }

        return true;
    }

    private static Map<String, Integer> getMagazineMap(String[] magazine) {
        Map<String, Integer> magazineMap = new HashMap<>();

        for (String word : magazine) {
            int wordCount = magazineMap.containsKey(word) ? magazineMap.get(word) + 1 : 1;
            magazineMap.put(word, wordCount);
        }

        return magazineMap;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
