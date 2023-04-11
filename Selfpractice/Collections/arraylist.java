package collections;
import java.util.*;
public class arraylist {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("ABHISHEK");
		name.add("SACHIN");
		name.add("AAKASH");
		name.add("PRATHEMESH");
		name.add("AMAN");
		
		//ADDING OF AN ELEMENT
		System.out.println("NAMES OF THE STUDENT IN A CLASS : " +name); //  [ABHISHEK, SACHIN, AAKASH, PRATHEMESH, AMAN]
		name.add("PRAKASH");
		name.add(0,"AMIT");
		name.add(4,"RAJESH");
		System.out.println("NAMES OF THE STUDENT IN A CLASS : " +name);  //  [AMIT, ABHISHEK, SACHIN, AAKASH, RAJESH, PRATHEMESH, AMAN, PRAKASH]
		
		//REMOVING AN ELEMENT   //    [AMIT, ABHISHEK, SACHIN, AAKASH, RAJESH, PRATHEMESH, AMAN, PRAKASH]
		name.remove(5);        //  [AMIT, ABHISHEK, SACHIN, AAKASH, RAJESH, AMAN, PRAKASH]
		name.remove(6);		   // [AMIT, ABHISHEK, SACHIN, AAKASH, RAJESH, AMAN]
		System.out.println("NAMES OF THE STUDENT IN A CLASS : " +name);
		
		//REPLACING AN ELEMENT    //[AMIT, ABHISHEK, SACHIN, AAKASH, RAJESH, AMAN]
		name.set(1,"abhishek_dubey");  //[AMIT, abhishek_dubey, SACHIN, AAKASH, RAJESH, AMAN]
		System.out.println("NAMES OF THE STUDENT IN A CLASS : " +name);
		
		
		for(int i=0;i<name.size();i++) {
			System.out.print(name.get(i)+"   ");
		}
		

		//get
		System.out.println( name.get(3));    //AAKASH
		name.clear();
		}

}
