import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class bearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int smaller = sc.nextInt();
        int larger = sc.nextInt();
        int count = 0;

        while(smaller<=larger){
            smaller *= 3;
            larger  *= 2;
            count++;
        }
        System.out.println(count);
    }
}
