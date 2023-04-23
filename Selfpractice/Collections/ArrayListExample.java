package collections;
import java.util.*;
public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(76);              //adding an element 
		list.add(86);
		list.add(73);
		list.add(70);
		System.out.println(list);    //printing all elements in an arraylist
		System.out.println(list.get(2));  //print an element at index 2
		list.add(2,3);               // adding an element to an specifif index
		list.set(3,1000);             // updating or replacing an element at index 3
		list.remove(1);                // removing an element at index 1
		System.out.println(list);
		System.out.println(list.size());  // getting the size of an arraylist in eements in it
		
		for (int i=0; i<list.size();i++) {
			System.out.println("Elemets are in Arraylist = "+ list.get(i));
		}
		
		Collections.sort(list);      // for sorting an elents in arraylist
		System.out.println(list);
		
		
		ArrayList<Integer> list2 =new ArrayList<Integer>();
		list2.add(101);              //adding an element 
		list2.add(826);
		list2.add(739);
		list2.add(702);
		System.out.println(list2);    //printing all elements in an arraylist
		boolean a =list.addAll(0, list2);
		System.out.println(a);
//		System.out.println(list2.get(2));  //print an element at index 2
		
	}
}


