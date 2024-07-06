import java.util.Scanner;

public class hitTheLottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int[] notes = {100, 20, 10, 5, 1};  //Always put large values at first
        int count = 0;

        for (int num : notes) {
            count += money / num;
            money %= num;
        }
        System.out.println(count);
    }
}
