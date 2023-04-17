package Threads;

class MyRunnable2 implements Runnable 
{
    public void run()
    {
        // Code to be executed in the thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

 public class Main3 
 {
    public static void main(String[] args) 
    {
        // Create an instance of MyRunnable
        MyRunnable2 mr = new MyRunnable2();

        // Create a thread and pass the MyRunnable instance to it
        Thread thread = new Thread(mr);

        // Start the thread
        thread.start();
        mr.run();

        // Code in the main thread
//        for (int i = 1; i <= 5; i++) 
//        {
//            System.out.println("Main thread is running: " + i);
//            try 
//            {
//                Thread.sleep(1000); // Sleep for 1 second
//            } catch (InterruptedException e) 
//            {
//                e.printStackTrace();
//            }
//        }
    }
}