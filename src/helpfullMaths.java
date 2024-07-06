import java.util.Arrays;
import java.util.Scanner;

public class helpfullMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // Split the string by "+"
        String[] numbers = s.split("\\+");

        // Sort the array
        Arrays.sort(numbers);

        // Join the sorted array back into a string with "+"
        String sortedSum = String.join("+", numbers);

        // Print the sorted string
        System.out.println(sortedSum);

        sc.close();
    }
}
