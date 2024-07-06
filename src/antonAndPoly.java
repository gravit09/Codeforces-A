import java.util.HashMap;
import java.util.Scanner;

public class antonAndPoly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Tetrahedron",4);
        map.put("Cube",6);
        map.put("Octahedron",8);
        map.put("Dodecahedron",12);
        map.put("Icosahedron",20);
        int ans = 0;

        for(int i=0;i<number;i++){
            String input = sc.next();
            if(map.containsKey(input)){
                ans += map.get(input);
            }
        }
        System.out.println(ans);
    }
}
