package Threads;
public class ThreadJoinDemoQ1 {
    
    public static void main(String[] args) {
        
        // Create and start five threads
        Thread t1 = new Thread(new MyRunnable(), "Thread 1");
        Thread t2 = new Thread(new MyRunnable(), "Thread 2");
        Thread t3 = new Thread(new MyRunnable(), "Thread 3");
        Thread t4 = new Thread(new MyRunnable(), "Thread 4");
        Thread t5 = new Thread(new MyRunnable(), "Thread 5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
        // Wait for all five threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // All threads have finished, so print a message
        System.out.println("All threads have finished.");
    }
    
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}
