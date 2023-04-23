package ExceptionalHandeling;

public class TypesOfError 
{
	//there are mainly there are maionly 3 types of error tht cat can occur during execaution of program
	//syntex error : programming syntex have some incorrect syntex       handeld by programmer
	//logical error : programming executes but show invalid or unwanted pages due to invalid logic     handeld by programmer
	// runtime error :   program may face error due to some expectional value inputed    it is handeled by user
	// there are two types of exceptions  checked which occur durning compile time 
	// uncheckedd  that occured during runtime 
	// NullPonterException  ; ArethemeaticException  ; ArrayOutOfBoundException  ; illeageArgumentException  ; NumberFormateException  ; IOException
	
	public static void main(String[] args) {
//		withgout try catch
		int d =10000;
		int e = d/0;
		System.out.println(e);
		
		
		
		int a =10000;
		try {
		int c = a/0;
		}
		catch(Exception e)
		{
		System.out.println("exception occured reason : ");
		// ca print any of method to pring  an excxeption
		System.out.println(e);
		System.out.println(e.getMessage());
		e.printStackTrace();
		}
		System.out.println("The program executed sucessfully");
		
		
	}
	
}
