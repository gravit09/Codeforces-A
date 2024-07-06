import java.util.Scanner;

public class ultraFastMathematician {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s1 = sc.next();
       String s2  = sc.next();
       StringBuilder sg = new StringBuilder();

      for(int i=0;i<s1.length();i++){
          if(s1.charAt(i) == s2.charAt(i)){
              sg.append(0);
          } else {
              sg.append(1);
          }
      }
        System.out.println(sg.toString());
    }
}
