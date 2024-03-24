package learning.java.concurrency.multithreading.threadlocal;

public class TaskWithThreadLocal implements Runnable {

    private int idGen = 100;
    private ThreadLocal<Integer> threadId = new ThreadLocal<>(){
        @Override
        protected Integer initialValue() {
            return (int) System.currentTimeMillis();
        }
    };

    @Override
    public void run() {
//        threadId.set((idGen + 10) * 5);
        for(int i = 0; i<5; i++) {
            System.out.println(Thread.currentThread().getName() + " --> " + threadId.get());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
