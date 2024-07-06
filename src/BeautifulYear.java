import java.util.Scanner;
import java.util.*;

public class BeautifulYear {
    // Helper method to check if a year has all distinct digits
    private static boolean hasDistinctDigits(int year) {
        String yearStr = Integer.toString(year);
        // Use a set to track digits
        Set<Character> digits = new HashSet<>();
        for (char c : yearStr.toCharArray()) {
            if (digits.contains(c)) {
                return false; // Duplicate digit found
            }
            digits.add(c);
        }
        return true; // All digits are distinct
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int nextYear = year + 1;

        // Find the next year with distinct digits
        while (!hasDistinctDigits(nextYear)) {
            nextYear++;
        }

        System.out.println(nextYear);
    }
}
