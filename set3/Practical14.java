//Create a class called Date that includes three pieces of information as instance variables—a month (type int), 
//a day (type int) and a year (type int). Your class should have a constructor that initializes the three instance 
//variables and assumes that the values provided are correct. Provide a set and a get method for each instance variable. 
//Provide a method displayDate that displays the month, day and year separated by forward slashes (/). 
//Write a test application named DateTest that demonstrates class Date’s capabilities


public class Practical14 {
    public static void main(String[] args) {
        DateTime d1 = new DateTime(10, 7, 2005);
        d1.getDate();
    }

}

class DateTime {
    int day, month, year;

    public DateTime(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
        System.out.println("Date initialized successfully!");

    }

    public void setDate(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;

    }

    public void getDate() {
        System.out.println(this.month+"/"+this.day+"/"+this.year);
    }



}
