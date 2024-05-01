package learning.java.concurrency.multithreading.callable.demo1;

import java.util.concurrent.Callable;

public class FactorialCallableTask implements Callable<Integer> {

    private int input;

    public FactorialCallableTask(int number) {
        this.input = number;
    }

    @Override
    public Integer call() throws Exception {
        if(this.input > 0) {
            int factorial = 1;
            for(int i = 1; i <= this.input; i++) {
                factorial = factorial * i;
            }
            return factorial;
        } else {
            return 0;
        }
    }

}
