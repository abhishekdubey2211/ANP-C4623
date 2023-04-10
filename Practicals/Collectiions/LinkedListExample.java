package Collections;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // create a linked list of integers
        LinkedList<Integer> list = new LinkedList<Integer>();

        // add elements to the linked list
        list.add(30);
        list.add(67);
        list.add(98);
        list.add(67);
        list.add(76);

        // display  linked list contents
        System.out.println("Linked List Contents: " + list);
    }
}
