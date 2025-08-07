
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int row = 0, col = 0;
        for (int i = 0; i < 5; i++) {
            String line = scanner.nextLine().replaceAll("\\s+", "");
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = line.charAt(j) - '0';
                if (matrix[i][j] == 1) {
                    row = i + 1;
                    col = j + 1;
                }
            }
        }
        int moves = Math.abs(row - 3) + Math.abs(col - 3);
        System.out.println(moves);
 
    }
}