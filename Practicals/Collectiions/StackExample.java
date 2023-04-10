package Collections;

import java.util.*;

public class StackExample {

	public static void main(String[] args) 
	{
		Stack<String> stc=new Stack<String>();
		
		//Adding object in ArrayList
		stc.push("Hello");
		stc.push("World");
		stc.push(".");
		stc.push("World");
		stc.pop();
		
		//traversing list through iterator
		Iterator itr=stc.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
