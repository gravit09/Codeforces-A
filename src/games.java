import java.util.Scanner;
public class games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] homeColors = new int[n];
        int[] guestColors = new int[n];

        for (int i = 0; i < n; i++) {
            homeColors[i] = sc.nextInt();
            guestColors[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && homeColors[i] == guestColors[j]) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
