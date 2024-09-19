import java.util.*;


public class Practical6sup {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] roll, grades;
        roll = new int[10];
        for(int i=1;i<=10;i++){
            roll[i-1]=i;
        }


        grades = new int[10];

        System.out.println("Welcome to the Classroom!");
        System.out.println("What would you like to do");
        int choice;


        do{
            System.out.println("1.Enter Student Grades");
            System.out.println("2.Display Student Grades");
            System.out.println("3.Exit the program");

            System.out.println("enter your choice:");
            choice = sc.nextInt();

            if(choice==1){
                for(int i=1;i<=10;i++){
                    System.out.println("Enter the Grade for roll no. "+i+":");
                    grades[i-1]=sc.nextInt();
                }
                System.out.println("Grades recorded and saved successfully!");
            }
            else{
                for(int i=1;i<=10;i++){
                    System.out.println("Grades for Roll no. "+i+" are "+grades[i-1]);
                    if(grades[i-1]>=50){
                        System.out.println("The student has passed");
                    }
                    else{
                        System.out.println("The student has failed.");
                    }
                }
            }
            
        } while (choice != 3);
        System.out.println("Thanks for using this program!");
        sc.close();

    }
}