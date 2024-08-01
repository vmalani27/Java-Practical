import java.util.*;

public class Practical4sup {
    public static void main(String[] args) {
        String[] fiction, non_fiction, merged;
        Scanner sc = new Scanner(System.in);
        int i,j;
        fiction = new String[5];
        non_fiction = new String[5];
        System.out.println("enter the elements in fictional section");
        for (i = 0; i < 5; i++) {
            System.out.println("enter Element" + (i + 1));
            fiction[i] = sc.nextLine();
        }
        System.out.println("enter the elements in non fictional section");
        for (i = 0; i < 5; i++) {
            System.out.println("enter Element" + (i + 1));
            non_fiction[i] = sc.nextLine();
        }


        merged = new String[10];
        
        for (i = 0; i < 5; i++) {
            merged[i] = fiction[i];
        }
        j=i;
        int k=0;
        for (j = i; j < 10; j++) {

            merged[j] = non_fiction[k];
            k++;
        }
       
        System.out.println("arrays merged!");
        System.out.print("resultant array: ");
        for (i = 0; i < 10; i++) {
            System.out.println(merged[i]);
        }
        sc.close();
        
    }
}
