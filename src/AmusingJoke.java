import java.util.HashMap;
import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String recipient = sc.next();
        String disordered = sc.next();

        String combined = name + recipient;

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : combined.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : disordered.toCharArray()) {
            if (map.containsKey(c) && map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
            } else {
                System.out.println("NO");
                return;
            }
        }

        for (int count : map.values()) {
            if (count != 0) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
