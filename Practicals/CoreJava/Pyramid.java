package corejava;
public class Pyramid 
{
	  public static void main(String[] args) 
	  {
		//storing maximum numbers of starts in a row storing in variable
	    int rows = 5;

	    for (int i = 1; i <= rows; ++i) 
	    {
	      for (int j = 1; j <= i; ++j) 
	      {
	        System.out.print("* ");
	      }
	      //printing the pyramid of star
	      System.out.println();
	    }
	  }
	}
