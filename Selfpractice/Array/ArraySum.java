package Array;
import java.util.*;
public class ArraySum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the float values = ");
		float[] numbers = new float[5];
		float sum=0;
		for(float i=0;i<numbers.length;i++) {
			numbers[(int) i]=sc.nextFloat();
			}
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i] + " , ");
			}
//		for (int i = 0; i < numbers.length; i++) {
//		    sum += numbers[i];
//		}
		// using for each loop
		for (float elements : numbers) {
		    sum += elements;
		}
		System.out.println(sum);
	}
}
