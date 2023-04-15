package OOPS;

// Multilevel inheritance: Example
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Labrador extends Dog {
    void color() {
        System.out.println("Labrador is black in color");
    }
}

public class Test {
    public static void main(String[] args) {
        Labrador l = new Labrador();
        l.eat(); // Output: Animal is eating
        l.bark(); // Output: Dog is barking
        l.color(); // Output: Labrador is black in color
    }
}

