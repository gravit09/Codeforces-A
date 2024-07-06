import java.util.Scanner;

public class bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        int value = 0;

        for (int i = 0; i < op; i++) {
            String st = sc.next();
            if (st.equals("++X") || st.equals("X++")) {
                value++;
            } else if (st.equals("--X") || st.equals("X--")) {
                value--;
            }
        }
        System.out.println(value);
    }
}
