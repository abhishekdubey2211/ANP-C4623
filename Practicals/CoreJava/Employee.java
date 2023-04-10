package corejava;
class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

class Clerk extends Employee {
    int hoursWorked;

    Clerk(String name, int id, double salary, int hoursWorked) {
        super(name, id, salary);
        this.hoursWorked = hoursWorked;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Hours Worked: " + hoursWorked);
    }
}
