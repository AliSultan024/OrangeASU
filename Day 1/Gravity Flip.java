import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] columns = new int[n];
        for (int i = 0; i < n; i++) {
            columns[i] = scanner.nextInt();
        }
 
        Arrays.sort(columns);
 
        for (int i = 0; i < n; i++) {
            System.out.print(columns[i] + " ");
        }
 
    }
}
 