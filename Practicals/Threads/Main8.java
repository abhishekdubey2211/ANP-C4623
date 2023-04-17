package Threads;

class MyRunnable8 extends Thread
{
    private String threadName;
    private boolean interrupted;

    public MyRunnable8(String threadName) 
    {
        this.threadName = threadName;
        this.interrupted = false;
    }

    public void run() 
    {
        // Code to be executed in the thread
        for (int i = 1; i <= 5 && !interrupted; i++)
        {
            System.out.println(threadName + " is running: " + i);
            try 
            {
                Thread.sleep(1000); // Sleep for 1 second
            } 
            catch (InterruptedException e) 
            {
                System.out.println(threadName + " is interrupted.");
                interrupted = true;
            }
        }
    }
}
public class Main8 {
    public static void main(String[] args) {
        // Create instances of MyRunnable
        MyRunnable8 myRunnable1 = new MyRunnable8("Thread 1");
        MyRunnable8 myRunnable2 = new MyRunnable8("Thread 2");

        // Create threads and pass the MyRunnable instances to them
//        Thread thread1 = new Thread(myRunnable1);
//        Thread thread2 = new Thread(myRunnable2);

        // Start the threads
        myRunnable1.start();
        myRunnable2.start();

        // Check if threads are alive
        System.out.println("Thread 1 is alive: " + myRunnable1.isAlive());
        System.out.println("Thread 2 is alive: " + myRunnable2.isAlive());

        // Join threads
        try 
        {
        	myRunnable1.join(); // Wait for thread1 to complete
            myRunnable2.join(); // Wait for thread2 to complete
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        // Check if threads are alive after joining
        System.out.println("Thread 1 is alive after joining: " + myRunnable1.isAlive());
        System.out.println("Thread 2 is alive after joining: " + myRunnable2.isAlive());

        // Interrupt a thread
        myRunnable1.interrupt();
    }
}