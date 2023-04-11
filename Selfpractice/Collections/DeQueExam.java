package collections;

import java.util.ArrayDeque;

public class DeQueExam {

	public static void main(String[] args) {
		ArrayDeque<String> name = new ArrayDeque<>();   //FIFO
		name.add("ABHISHEK");
		name.add("SACHIN");
		name.add("AAKASH");
		name.add("PRATHEMESH");
		name.add("AMAN");

		System.out.println(name);     //[ABHISHEK, SACHIN, AAKASH, PRATHEMESH, AMAN]
		name.pop();                   //first element will pop out first
		System.out.println(name);     //[SACHIN, AAKASH, PRATHEMESH, AMAN]
		name.add("majnu");
		System.out.println(name);     //[SACHIN, AAKASH, PRATHEMESH, AMAN, majnu]
		name.pollFirst();
		System.out.println(name);     //[AAKASH, PRATHEMESH, AMAN, majnu]
		name.pollLast();
		System.out.println(name);     //[AAKASH, PRATHEMESH, AMAN]
		name.push("rockers");
		System.out.println(name);     //[rockers, AAKASH, PRATHEMESH, AMAN]
		}

}
