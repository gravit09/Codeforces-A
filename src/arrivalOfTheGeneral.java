import java.util.Scanner;

public class arrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soldiers = sc.nextInt();
        int[] arr = new int[soldiers];
        int maxIndex = 0;
        int minIndex = 0;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < soldiers; i++) {
            int val = sc.nextInt();
            arr[i] = val;

            if (val > max) {
                max = val;
                maxIndex = i;
            }
            if (val <= min) {
                min = val;
                minIndex = i;
            }
        }

        int moves = maxIndex + (soldiers - 1 - minIndex);

        // If minIndex is before maxIndex, reducing one move as they overlap
        if (minIndex < maxIndex) {
            moves--;
        }

        System.out.println(moves);
    }
}
