import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int lower =0;
        int upper = 0;

        for(char c: input.toCharArray()){
            if(Character.isUpperCase(c)){
                upper++;
            } else{
                lower++;
            }
        }
        if(lower>=upper){
            System.out.println(input.toLowerCase());
        } else {
            System.out.println(input.toUpperCase());
        }
    }
}
