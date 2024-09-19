import java.util.*;


public class Practical4 {
    public static void main(String[] args) {
        int[] expense;
        expense = new int[30];
        Scanner cin = new Scanner(System.in);
        int choice;
        System.out.println("how many expenses");
        choice = cin.nextInt();

        for (int i = 0; i < choice; i++) {
            System.out.println("enter the expense" + (i + 1));
            expense[i] = cin.nextInt();
        }
        
        int sum=0;
        for (int i = 0; i < choice; i++) {
            sum += expense[i];
        }

        System.out.println("your total expense " + sum);
        cin.close();
    }
}
