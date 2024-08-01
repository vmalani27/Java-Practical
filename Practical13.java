class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;
    
    // Constructor to initialize the instance variables
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
            System.out.println("Invalid salary entered! Employee salary set to 0.0");
        }
    }
    
    // Getter and setter for first name
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    // Getter and setter for last name
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    // Getter and setter for monthly salary
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
            System.out.println("Invalid salary entered! Employee salary set to 0.0");
        }
    }
}

public class Practical13 {
    public static void main(String[] args) {
        // Creating two Employee objects
        Employee emp1 = new Employee("Vansh", "Malani", 3000);
        Employee emp2 = new Employee("James", "Dhandhukiya", 4000);

        // Displaying yearly salary for each employee
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + "'s yearly salary: " + (emp1.getMonthlySalary() * 12));
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + "'s yearly salary: " + (emp2.getMonthlySalary() * 12));

        // Giving each employee a 10% raise
        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.10);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.10);

        // Displaying yearly salary again after the raise
        System.out.println("After 10% raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + "'s yearly salary: " + (emp1.getMonthlySalary() * 12));
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + "'s yearly salary: " + (emp2.getMonthlySalary() * 12));
    }
}
