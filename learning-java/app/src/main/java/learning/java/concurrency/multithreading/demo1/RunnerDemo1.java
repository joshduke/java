package learning.java.concurrency.multithreading.demo1;

import java.util.stream.Stream;

public class RunnerDemo1 implements Runnable {

    @Override
    public void run() {
        Stream.of(1,2,3,4,5,6,7,8,9,10).forEach(i -> {
            System.out.println(Thread.currentThread().getName() + " in iteration --> " + i);
        });
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new RunnerDemo1());
        Thread t2 = new Thread(new RunnerDemo1());
        t1.setName("Thread-1");
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setName("Thread-2");
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
//        t1.join();
        t2.start();
        t1.yield();
//        t1.yield();
    }

}
