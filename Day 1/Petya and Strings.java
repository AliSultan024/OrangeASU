import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine().trim();
        String string2 = scanner.nextLine().trim();
 
        String string1Lower = string1.toLowerCase();
        String string2Lower = string2.toLowerCase();
 
        int comparison = string1Lower.compareTo(string2Lower);
 
        if (comparison < 0) {
            System.out.println("-1");
        } else if (comparison > 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}