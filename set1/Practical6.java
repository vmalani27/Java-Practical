import java.util.*;




public class Practical6 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Welcome to the exercise program!");
        System.out.println("enter the number of days you want to exercise for:");
        int n = cin.nextInt();
        System.out.println("This is your exercise schedule");
        for (int i = 1; i < n; i++) {
            System.out.println("Day "+i+":You have to exercise for "+fib(i)+" hours");
        }
        
        cin.close();
    }
    

    public static int fib(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}