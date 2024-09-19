import java.util.Scanner;

public class Practical5 {
    public static void main(String[] args) {
        int[] price = { 200, 3000, 100, 50, 80 };
        int[] code = { 1, 2, 3, 4, 5 };
        String[] item = { "Motor", "Fan", "Tube", "Wire", "Others" };
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Bijli Appliances. What do you want to buy?");
        
        int choice;
        int[] qty = { 0, 0, 0, 0, 0 };
        
        for (int i = 0; i < 5; i++) {
            System.out.println(code[i] + "." + item[i] + "\t" + price[i]);
        }
        System.out.println("To exit the program press 6");
        do {
            
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    qty[choice - 1] += 1;
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please select a valid option.");
            }
            
        } while (choice != 6);
        
        System.out.println("\nThis is your Bill:");
        System.out.println("\tBijli Appliances");
        
        int totalGoods = 0;
        int totalPrice = 0;
        
        for (int i = 0; i < 5; i++) {
            if (qty[i] > 0) {
                System.out.println(item[i] + "\tQuantity: " + qty[i] + "\tPrice: " + (qty[i] * price[i]));
                totalGoods += qty[i];
                totalPrice += qty[i] * price[i];
            }
        }
        
        System.out.println("\nTotal Qty of Goods: " + totalGoods);
        System.out.println("Total Bill: " + totalPrice);
        System.out.println("Thanks for visiting... come again!");

        sc.close();
    }
}
