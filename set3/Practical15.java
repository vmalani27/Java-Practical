public class Practical15 {
    public static void main(String[] args) {
        Area a1 = new Area(10, 20);
        Area a2 = new Area(40, 50);
        
        System.out.println("the area of Rectangle 1 is:" + a1.returnArea());
        
        System.out.println("the area of Rectangle 2 is:" + a2.returnArea());
    }
}

class Area {
    int length, breadth;

    public Area(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public float returnArea() {
        float area;
        area = length * breadth;
        return area;
    }



}
