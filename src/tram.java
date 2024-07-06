import java.util.Scanner;

public class tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stations = sc.nextInt();

        int maxCapacity = 0;
        int currentCapacity = 0;

        for (int i = 0; i < stations; i++) {
            int exiting = sc.nextInt();
            int entering = sc.nextInt();

            currentCapacity = currentCapacity - exiting + entering;

            if (currentCapacity > maxCapacity) {
                maxCapacity = currentCapacity;
            }
        }

        System.out.println(maxCapacity);
    }
}
