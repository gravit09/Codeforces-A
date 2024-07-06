import java.util.Scanner;

public class wayTooLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int words = sc.nextInt();
        String[] arr = new String[words];

        for(int i=0;i<words;i++){
            arr[i] = sc.next();
        }

        for(String wr : arr){
            int length = wr.length();
            if(length>10){
                System.out.println(wr.charAt(0) + "" + (wr.length()-2) + wr.charAt(wr.length() - 1));
            } else{
                System.out.println(wr);
            }
        }
    }
}
