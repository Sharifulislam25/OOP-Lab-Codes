
package MultiThread;


public class Main {
    public static void main(String[] args) {
        MyThreadClass R1 = new MyThreadClass("Thread-1");
        R1.start();
        MyThreadClass R2 = new MyThreadClass("Thread-2");
        R2.start();
    }
    
}
