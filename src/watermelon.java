import java.util.Scanner;

public class watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight  = sc.nextInt();

        if(weight % 2 == 0 && weight != 2){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
