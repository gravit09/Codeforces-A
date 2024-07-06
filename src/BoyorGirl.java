import java.util.HashMap;
import java.util.Scanner;

public class BoyorGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c:userName.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,0);
            } else {
                map.put(c,map.get(c)+1);
            }
        }
        if(map.size()%2 ==0){
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
