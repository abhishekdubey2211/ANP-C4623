package corejava;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John Smith", 1001, 50000.0, "Sales");
        Clerk clerk = new Clerk("Jane Doe", 2001, 25000.0, 40);
        manager.displayDetails();
        clerk.displayDetails();
    }
}
