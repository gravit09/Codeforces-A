import java.util.Scanner;

public class queueAtSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int rotations = sc.nextInt();
        String line  = sc.next();
        StringBuilder queue = new StringBuilder(line);

        for (int i = 0; i < rotations; i++) {
            for (int j = 0; j < students - 1; j++) {
                if (queue.charAt(j) == 'B' && queue.charAt(j + 1) == 'G') {

                    queue.setCharAt(j, 'G');
                    queue.setCharAt(j + 1, 'B');
                    j++; 
                }
            }
        }
        System.out.println(queue.toString());
    }
}
