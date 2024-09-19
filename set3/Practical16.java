public class Practical16 {
    public static void main(String[] args) {
        complex c1, c2,c3,c4,c5;
        c1= new complex(10,5);
        c2=new complex(5,20);
        c3 = new complex();
        c4 = new complex();
        c5 = new complex();
        c3.add(c1,c2);
        System.out.println("the value of c1+c2 is ");
        c3.display();

        c4.diff(c1, c2);
        System.out.println("the value of c1-c2 is ");
        c4.display();

        c5.product(c1, c2);
        System.out.println("the value of c1*c2 is ");
        c5.display();


        
    }
}


class complex {
    int real;
    int imaginary;

    public complex(int r, int c) {
        this.real = r;
        this.imaginary = c;
    }

    public complex() {
        this.real = 0;
        this.imaginary = 0;
    }
    
    public void add(complex c1, complex c2) {
        this.real = c1.real + c2.real;
        this.imaginary = c1.imaginary + c2.imaginary;
    }
    
    public void diff(complex c1, complex c2) {
        this.real = c1.real - c2.real;
        this.imaginary = c1.imaginary - c2.imaginary;
    }
    
    public void product(complex c1, complex c2) {
        this.real = c1.real * c2.real - c1.imaginary * c2.imaginary;
        this.imaginary = c1.real * c2.imaginary + c2.real * c1.imaginary;
    }
    
    public void display() {
        System.out.println(this.real+" + "+this.imaginary+"i");
    }
}