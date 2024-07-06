import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int problems = sc.nextInt();
       int count =0;

       for(int i=0;i<problems;i++){
           int tempCount = 0;
           for(int j=0;j<3;j++){
               tempCount += sc.nextInt();
           }
           if(tempCount >= 2){
               count++;
           }
       }
        System.out.println(count);
    }
}
