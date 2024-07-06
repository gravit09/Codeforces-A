import java.util.Scanner;

public class vanyaAndFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int noOfFriends = sc.nextInt();
        int fenceHeight = sc.nextInt();
        int width = 0;

        for(int i=0;i<noOfFriends;i++){
            int height= sc.nextInt();
            if(height>fenceHeight){
                width +=2;
            }else {
                width +=1;
            }
        }
        System.out.println(width);
    }
}
