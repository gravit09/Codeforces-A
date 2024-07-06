import java.util.Scanner;

public class georgeAndAccomodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rooms = sc.nextInt();

        int count = 0;

        for(int i=0;i<rooms;i++){
            int people = sc.nextInt();
            int capacity = sc.nextInt();

            if(capacity-people >=2){
                count++;
            }
        }
        System.out.println(count);
    }
}
