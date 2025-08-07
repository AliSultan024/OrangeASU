import java.util.Scanner;
 
public class Main {
    public static void Anton_and_Danik(String[] args) {
        int width = 0;
        Scanner scanner = new Scanner(System.in);
 
        int No_matches = scanner.nextInt();
        String s = scanner.next();
        int a=0,d=0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                a++;
            } else if (c == 'D') {
                d++;
            }
        }
            if(a>d){
                System.out.println("Anton");
            }else if(d>a){
                System.out.println("Danik");
            } else{
                System.out.println("Friendship");
        }
        scanner.close();
 
 
    }
}