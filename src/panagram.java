import java.util.HashSet;
import java.util.Scanner;

public class panagram {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        HashSet<Character> ans = new HashSet<>();

        int digits = sc.nextInt();
        sc.nextLine();

        String st = sc.nextLine().toLowerCase();

        for(int i=0;i<digits;i++){
            char ch = st.charAt(i);
            ans.add(ch);
        }

        Boolean isValid = true;

        for(char i = 'a'; i<='z';i++){
            if(!ans.contains(i)){
               isValid = false;
               break;
            }
        }
        if(isValid){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
