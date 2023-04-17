package Threads;

public class AllMethodThread extends Thread 
{
	public void run() 
	{
		for(int i=1; i<=6;i++) 
		{
			System.out.println("Thread"+Thread.currentThread().getId()+" : "+i);
		}
		try 
		{
			Thread.sleep(1000,9); 
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
class ThreadMain
{
	public static void main(String[] args) {
		AllMethodThread amt1 = new AllMethodThread();
		AllMethodThread amt2 = new AllMethodThread();
		AllMethodThread amt3 = new AllMethodThread();
		
		amt1.start();
		amt2.start();
		amt3.start();
		
		try
		{
			amt1.join();
			amt2.join();
			amt3.join();
		}
		catch(InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("All thread sun sucessfully");
	}

}

