package Threads;
import java.util.Comparator;
import java.util.TreeSet;

public class ReverseTreeSetDemoQ3 {
    public static void main(String[] args) {
        
        // Create a new TreeSet with a custom Comparator that sorts elements in reverse order
        TreeSet<Integer> numbers = new TreeSet<Integer>(new ReverseComparator());
        
        // Add some elements to the TreeSet
        numbers.add(5);
        numbers.add(10);
        numbers.add(1);
        numbers.add(8);
        
        // Print the elements in descending order
        System.out.println("Elements in descending order:");
        for (int n : numbers.descendingSet()) {
            System.out.println(n);
        }
    }
    
    // A custom Comparator that sorts elements in reverse order
    static class ReverseComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            return b.compareTo(a);
        }
    }
}
