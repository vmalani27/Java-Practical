import java.util.Scanner;
public class bankapp {
    
    public static void main(String[] args){
        long accnum[];
        accnum=new long[10];
        int balance[];
        balance=new int[10];
    


        System.out.println("Welcome to the bank!");
        int choice;
        Scanner cin = new Scanner(System.in);
        do{
        
        System.out.println("what would you like to do?");
        System.out.println("1. Add user data");
        System.out.println("2. view balance");
        System.out.println("3. Exit");
        choice = cin.nextInt();

            switch (choice) {
                case 1:
                
                    int input;
                    System.out.println("how many user's data you want to enter?");
                    input = cin.nextInt();
                    for(int i=0;i<input;i++){
                        System.out.println("enter the account number for customer "+(i+1));
                        accnum[i]= cin.nextLong();
                    }
                    for(int i=0;i<input;i++){
                        System.out.println("enter the balance for the customer "+(i+1));
                        balance[i]=cin.nextInt();
                    }
                    System.out.println("information stored successfully!");

                    break;
                case 2:
                    long check;
                    int found=0,index=0;    
                    System.out.println("enter the account number: ");
                    check = cin.nextLong();
                    for (int i = 0; i < 10; i++) {
                        if (accnum[i] == check) {
                            found = 1;
                            index = i;
                            break;
                        } else {
                            found = 0;
                        }
                    }
                    if (found == 0) {
                        System.out.println("The Account number is invalid");
                    }
                    else {
                        System.out.println("The balance of Account Number" + accnum[index] + "is " + balance[index]);
                        
                    }
                    
                default:
                    cin.close();
                    break;
                    
            }





        }while(choice!=3);


    }

}