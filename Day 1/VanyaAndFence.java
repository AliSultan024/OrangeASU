
import java.util.Scanner;
 
public class VanyaAndFence {
    public static void main(String[] args) {
        int width = 0;
        Scanner scanner = new Scanner(System.in);
 
        int No_friends = scanner.nextInt(); // number of friends
        int height = scanner.nextInt();     // height limit
        for (int i = 1; i <= No_friends; i++) {
            int person_height = scanner.nextInt();
            if (person_height > height) {
                width += 2;
            } else {
                width += 1;
            }
        }
        scanner.close();
        System.out.println(width);
 
    }
}