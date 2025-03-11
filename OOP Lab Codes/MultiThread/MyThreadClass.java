package MultiThread;

public class MyThreadClass implements Runnable {
    
    private Thread t;
    private String threadName;

    // Constructor
    MyThreadClass(String threadName) {
        this.threadName = threadName;
        System.out.println("Thread Creating: " + threadName);
    }

    public void run() {
        System.out.println("Running: " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread " + threadName + ", " + i);
                Thread.sleep(50);
            }
        } 
        catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " Exiting.");
    }

    public void start() {
        System.out.println("Starting: " + threadName);
        // Check if the thread is null before creating it
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
