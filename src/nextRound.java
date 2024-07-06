import java.util.Scanner;

public class nextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int players = sc.nextInt();
        int k  = sc.nextInt();
        int[] scores = new int[players];
        int ans =0;

        for(int i=0;i<players;i++){
            scores[i] = sc.nextInt();
        }

        for(int i=0;i<players;i++){
            if(scores[i]>=scores[k-1] && scores[i] != 0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
