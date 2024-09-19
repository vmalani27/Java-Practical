import java.util.*;

public class Practical7 {
    public static void main(String[] args) {

        String input;
        int n;
        Scanner sc = new Scanner(System.in);

        input = sc.nextLine();
        n=sc.nextInt();

        front_times(input, n);
        sc.close();
    }
    
    public static void front_times(String S, int n) {
        for (int i = 0; i < n; i++) {
            if (S.length() < 3) {
                System.out.print(S);
            }
            else{      
            
                System.out.print(S.substring(0, 3));
            }
        }

    }
}
