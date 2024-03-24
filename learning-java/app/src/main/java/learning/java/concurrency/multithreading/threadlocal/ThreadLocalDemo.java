package learning.java.concurrency.multithreading.threadlocal;

public class ThreadLocalDemo {

    public static void main(String[] args) {
        Thread t1 = new Thread(new TaskWithThreadLocal());
        Thread t2 = new Thread(new TaskWithThreadLocal());
        Thread t3 = new Thread(new TaskWithThreadLocal());
        Thread t4 = new Thread(new TaskWithThreadLocal());
        Thread t5 = new Thread(new TaskWithThreadLocal());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

}
