package learning.java.concurrency.multithreading.synchronize;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SynchronizedDemo {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        VisitorReportWork visitorReportWork = new VisitorReportWork();
        IntStream.range(0, 100).forEach(
                (i) -> new Thread(visitorReportWork::doVisit).start()
        );
        Thread.sleep(5000);
//        IntStream.range(0, 100).forEach(count -> executorService.submit(visitorReportWork::doVisit));
//        executorService.awaitTermination(1000, TimeUnit.MILLISECONDS);
        System.out.println(visitorReportWork.getVisitors());
    }

}


class VisitorReportWork {

    private int visitors = 0;

    public synchronized void doVisit() {
        visitors = visitors + 1;
    }

    public int getVisitors() {
        return visitors;
    }
}

