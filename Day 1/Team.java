
import java.util.Scanner;
 
public class Main {
    public static void Team(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int n=scanner.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int petya = scanner.nextInt();
            int vasya = scanner.nextInt();
            int tonya = scanner.nextInt();
            if(petya+vasya+tonya>=2){
                count++;
            }
 
        }
        scanner.close();
        System.out.println(count);
 
    }
}