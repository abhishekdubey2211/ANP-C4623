package collections;
import java.util.Stack;
public class StackExam {

	public static void main(String[] args) {
		Stack<String> name = new Stack<>();   //LIFO
		name.add("ABHISHEK");
		name.add("SACHIN");
		name.add("AAKASH");
		name.add("PRATHEMESH");
		name.add("AMAN");

		System.out.println(name);
		name.pop();   // last element will pop out first
		System.out.println(name);
		name.add("chaparganju");
		System.out.println(name);
	}

}
