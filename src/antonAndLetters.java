import java.util.HashSet;
import java.util.Scanner;

public class antonAndLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch != '{' && ch != '}' && ch != ',' && ch != ' ') {
                set.add(ch);
            }
        }

        count = set.size();
        System.out.println(count);
    }
}
