import java.util.Scanner;
import java.util.Stack;

public class stonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String stones = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            char currentStone = stones.charAt(i);

            if (!stack.isEmpty() && stack.peek() == currentStone) {
                count++;
            } else {
                stack.push(currentStone);
            }
        }

        sc.close();
        System.out.println(count);
    }
}
