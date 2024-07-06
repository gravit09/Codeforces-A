import java.util.Scanner;

public class divisiblityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputs = sc.nextInt();

        for(int i=0;i<inputs;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int reminder = a%b;

            int ans = reminder == 0 ? 0 : b-reminder;

            System.out.println(ans);
        }
    }
}
