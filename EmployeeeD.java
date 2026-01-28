class Employee {
    public double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    private double Salary = 50000;

    @Override
    public double calculateSalary() {
        return Salary;
    }
}

class PartTimeEmployee extends Employee {
    private int hours = 80;
    private double ratePerHour = 500;

    @Override
    public double calculateSalary() {
        return hours* ratePerHour;
    }
}

public class EmployeeeD {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();

        System.out.println("Full Time Salary: " + e1.calculateSalary());
        System.out.println("Part Time Salary: " + e2.calculateSalary());
    }
}
