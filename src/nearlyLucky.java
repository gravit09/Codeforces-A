import java.util.Scanner;

public class nearlyLucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        int count = 0;

        while(number>0){
            if(number%10 == 4 || number % 10 == 7){
                count++;
                number /= 10;
            } else {
                number /= 10;
            }
        }
        if(count == 4 || count == 7){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
