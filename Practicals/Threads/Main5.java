package Threads;
class MyRunnable4 implements Runnable
{
    private String threadName;
    private boolean interrupted;

    public MyRunnable4(String threadName) 
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
public class Main5 {
    public static void main(String[] args) {
        // Create instances of MyRunnable
        MyRunnable4 myRunnable1 = new MyRunnable4("Thread 1");
        MyRunnable4 myRunnable2 = new MyRunnable4("Thread 2");

        // Create threads and pass the MyRunnable instances to them
        Thread thread1 = new Thread(myRunnable1);
        Thread thread2 = new Thread(myRunnable2);

        // Start the threads
        thread1.start();
        thread2.start();

        // Check if threads are alive
        System.out.println("Thread 1 is alive: " + thread1.isAlive());
        System.out.println("Thread 2 is alive: " + thread2.isAlive());

        // Join threads
        try 
        {
            thread1.join(); // Wait for thread1 to complete
            thread2.join(); // Wait for thread2 to complete
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        // Check if threads are alive after joining
        System.out.println("Thread 1 is alive after joining: " + thread1.isAlive());
        System.out.println("Thread 2 is alive after joining: " + thread2.isAlive());

        // Interrupt a thread
        thread1.interrupt();
    }
}