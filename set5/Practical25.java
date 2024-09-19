import java.util.*;

public class Practical25 {
    public static void main(String args[]) {
        int a, b, c, result;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        try{
            result = (a + b) / c;
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught: division by zero");
        }
        sc.close();
    }
}
