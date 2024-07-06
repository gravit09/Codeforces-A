import java.util.HashSet;
import java.util.Scanner;

public class horseShoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        int ans = 4-set.size();
        System.out.println(ans);


    }
}
