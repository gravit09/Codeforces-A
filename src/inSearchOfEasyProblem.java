import java.util.Scanner;

public class inSearchOfEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int problem = sc.nextInt();
            if(problem == 1){
                System.out.println("HARD");
                return;
            }
        }
        System.out.println("EASY");
    }
}
