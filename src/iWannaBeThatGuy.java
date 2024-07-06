import java.util.HashSet;
import java.util.Scanner;

public class iWannaBeThatGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> levels = new HashSet<>();

        int series = sc.nextInt();

        int first = sc.nextInt();
        for (int i = 0; i < first; i++) {
            int level = sc.nextInt();
            levels.add(level);
        }

        int second = sc.nextInt();
        for (int i = 0; i < second; i++) {
            int level = sc.nextInt();
            levels.add(level);
        }

        boolean allLevelsCovered = true;
        for (int i = 1; i <= series; i++) {
            if (!levels.contains(i)) {
                allLevelsCovered = false;
                break;
            }
        }

        if (allLevelsCovered) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }

    }
}
