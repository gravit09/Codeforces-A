import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        String captalizedString = Character.toUpperCase(st.charAt(0))+st.substring(1);
        System.out.println(captalizedString);

    }
}
