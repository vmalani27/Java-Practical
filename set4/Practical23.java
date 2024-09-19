import java.util.Scanner;

public class Practical23 {
    Scanner sc = new Scanner(System.in);
}

interface Circle {
    Scanner sc = new Scanner(System.in);
    int radius=sc.nextInt();
    String colour=sc.next();
}

interface Rectangle {
    Scanner sc = new Scanner(System.in);
    int length=sc.nextInt(), width=sc.nextInt();
    String Colour=sc.next();
}

interface shapes {
    
}

class sign implements Circle, Rectangle{
    


}