package Collections;
import java.util.*;//import java utility class

public class ArrayListExample 
{

	public static void main(String[] args) 
	{
		ArrayList<String> arraylist=new ArrayList<String>();
		//adding object in Arraylist
		arraylist.add("mango");
		arraylist.add("Apple");
		arraylist.add("orange");
		arraylist.add("Grapes");
		arraylist.add("mango");
		//traversing list to iterator
		Iterator itr=arraylist.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());	
		}
	}
}
