import java.util.*;
public class Practical15sup {
    public static void main(String[] args) {
        Airplane a1 = new Airplane(37, "3 AM", "Delhi", 0);
        Airplane a2 = new Airplane(7, "6 AM", "Mumbai", 1);
        a1.FLightStat();
        a1.CheckDelay();
        a2.FLightStat();
        a2.CheckDelay();
    }
}

class Airplane {
    int flightno;
    String departure, destination;
    int flag;
    Random rand = new Random();
    int ran;
    public Airplane(int f, String dep, String des,int flag) {
        this.flightno = f;
        this.departure = dep;
        this.destination = des;
        this.flag = flag;
        if (this.flag == 0) {
            ran = rand.nextInt(50);
        }
        else {
            ran = 500;
        }
    }

    public void FLightStat() {
        if (this.flag == 0) {
            System.out.println("Flight is on schedule and arriving in " + this.ran + " minutes");
        } else {
            this.ran = this.ran / 60;
            System.out.println("Flight is delayed and arriving in " + ran + " hours");
        }
    }

    public void CheckDelay() {
        if (flag == 0) {
            System.out.println("there is no delay");
        }
        else {
            this.ran = this.ran / 60;
            System.out.println("there is a delay. The flight will arrive in "+ran+" hours");
        }
        
    }
}
