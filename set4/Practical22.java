import java.util.Scanner;

public class Practical22 {
    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator();
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println("the sum of divisors of " + n + "is " + mc.divisor_sum(n));
        sc.close();
    }
}


interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    
    
    @Override
    public int divisor_sum(int n) {
        int sum=0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        
        return sum;


        
    }

}