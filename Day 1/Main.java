import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().trim();
        int upperCount = 0;
        int lowerCount = 0;
        
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isUpperCase(c)) {
                upperCount++;
            } else {
                lowerCount++;
            }
        }
        
        if (upperCount > lowerCount) {
            System.out.println(word.toUpperCase());
        } else {
            System.out.println(word.toLowerCase());
        }
    }
}