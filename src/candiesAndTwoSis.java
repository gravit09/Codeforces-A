import java.util.Scanner;

public class candiesAndTwoSis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number= sc.nextInt();

        for(int i=0;i<number;i++){
            int value = sc.nextInt();

            if(value<=2){
                System.out.println(0);
            } else {
                System.out.println((value-1)/2);
            }
        }
    }
}
