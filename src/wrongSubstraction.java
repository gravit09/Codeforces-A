import java.util.Scanner;

public class wrongSubstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = sc.nextInt();

        for(int i=0;i<count;i++){
            if(number%10 == 0){
                number /= 10;
            } else {
                number--;
            }
        }
        System.out.println(number);
    }
}
