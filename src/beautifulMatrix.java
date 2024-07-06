import java.util.Scanner;

public class beautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] ans = new int[5][5];
        int row = 0;
        int col = 0;


        for(int i= 0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                ans[i][j] = sc.nextInt();
                if(ans[i][j] == 1){
                    row = i;
                    col = j;
                }
            }
        }

        int moves = Math.abs(row-2)+Math.abs(col-2);
        System.out.println(moves);
    }
}
