package collections;

import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {
		LinkedList<String> name = new LinkedList<String>();
		name.add("ABHISHEK");
		name.add("SACHIN");
		name.add("AAKASH");
		name.add("PRATHEMESH");
		name.add("AMAN");
		
		System.out.println(name);    //[ABHISHEK, SACHIN, AAKASH, PRATHEMESH, AMAN]
		name.addFirst("Amit Dubey");
		name.add("jasraj");
		name.add(3,"paras");
		name.addLast("Piyush");
		System.out.println(name);   //[Amit Dubey, ABHISHEK, SACHIN, paras, AAKASH, PRATHEMESH, AMAN, jasraj, Piyush]
		
		//using for loop
		for (int i=0; i<name.size();i++) {
			System.out.print(name.get(i)+"  ");  //Amit Dubey  ABHISHEK  SACHIN  paras  AAKASH  PRATHEMESH  AMAN  jasraj  Piyush 
		}
		
		
		//using for each loop
		for (String str : name)
		{
			System.out.print(str +"  ");  //Amit Dubey  ABHISHEK  SACHIN  paras  AAKASH  PRATHEMESH  AMAN  jasraj  Piyush 
		}
		
	}

}
