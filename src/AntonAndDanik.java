import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        String wins = sc.next();

        int antonScore = 0;
        int danikScore =0;

       for(int i=0;i<games;i++){
           if(wins.charAt(i) == 'A'){
               antonScore++;
           } else {
               danikScore++;
           }
       }

       if(antonScore>danikScore){
           System.out.println("Anton");
       } else if (danikScore>antonScore){
           System.out.println("Danik");
       } else {
           System.out.println("Friendship");
       }

    }
}



