package Threads;

class EvenThread extends Thread 
{
    public void run() 
    {
        for (int i = 2; i <= 10; i += 2) 
        {
            System.out.println("EvenThread= " + i);
            try 
            {
                Thread.sleep(1000); 
            } catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
}

class OddThread extends Thread 
{
    public void run() 
    {
        for (int i = 1; i <= 9; i += 2) 
        {
            System.out.println("OddThread= " + i);
            try 
            {
                Thread.sleep(1000); //
            } catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
}
public class CheckEvenOddUsingThread 
{
    public static void main(String[] args) 
    {
        EvenThread et = new EvenThread();
        OddThread ot = new OddThread();
        et.start();
        ot.start();
    }
}