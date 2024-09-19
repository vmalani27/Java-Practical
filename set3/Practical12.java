import java.util.*;


public class Practical12 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float pound;
        float rupee;
        // System.out.println("enter the amount in pounds:");
        
        pound= Float.parseFloat(args[1]);
        
        rupee=100*pound;
        
        System.out.println("amount in rupees is "+rupee);
        sc.close();
        
        	    
	}
}