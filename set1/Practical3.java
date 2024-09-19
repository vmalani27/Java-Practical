import java.util.*;


public class Practical3 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("enter the distance in meters");
        float meter, kilometer, miles;
        meter = cin.nextFloat();
        kilometer = meter / 1000;
        miles = meter/1609;

        System.out.println("enter the time in hours");
        int hours;
        hours = cin.nextInt();
        System.out.println("enter the time in minutes");
        int minutes = cin.nextInt();

        System.out.println("enter the time in seconds");
        int seconds = cin.nextInt();

        float totalsec,totalmin,totalhour;
        totalsec = hours * 3600 + minutes * 60 + seconds;
        totalmin = totalsec / 60;
        totalhour = totalmin / 60;
        System.out.println("totalsec" + totalsec);
        System.out.println("totalmin"+totalmin);

        float mps, kmh, mph;

        mps = meter / totalsec;
        kmh = kilometer / totalhour;
        mph = miles / totalhour;

        System.out.println("the speed in meters/second is " + mps);
        System.out.println("the speed in kilometers/hour is " + kmh);
        System.out.println("the speed in miles/hour is " + mph);
        cin.close();

    }
}
