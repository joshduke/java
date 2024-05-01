package learning.java.concurrency.multithreading.callable.demo1;

import java.util.Optional;
import java.util.concurrent.*;

public class FactorialCallableTaskDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        FactorialCallableTask task = new FactorialCallableTask(3);
        Future<Integer> factorial;
        factorial = executorService.submit(task);
        System.out.print(factorial.get());
        executorService.shutdown();
    }

}
