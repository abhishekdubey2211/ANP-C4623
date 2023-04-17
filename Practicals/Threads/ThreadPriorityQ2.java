package Threads;
public class ThreadPriorityQ2 {
    
    public static void main(String[] args) {
        
        // Create three threads with different priorities
        Thread t1 = new Thread(new MyRunnable(), "Thread 1");
        Thread t2 = new Thread(new MyRunnable(), "Thread 2");
        Thread t3 = new Thread(new MyRunnable(), "Thread 3");
        t1.setPriority(Thread.MAX_PRIORITY);    // highest priority
        t2.setPriority(Thread.NORM_PRIORITY);   // default priority
        t3.setPriority(Thread.MIN_PRIORITY);    // lowest priority
        
        // Start the threads
        t1.start();
        t2.start();
        t3.start();
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
