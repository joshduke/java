## Callable Demo

In this demo, callable task is developed to execute Factorial computation.

<code language="java">

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
</code>

In this code, the class implements Callable interface that can be executed as separate thread using the Executor frameworks in Java.
This Callable interface can return or not return any value. But in our case, we have made the callable interface to return Integer.

<code style="Java">

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
</code>

In the main program, we create an instance of CallableTask and pass to executor service to execute the task.
Although 5 threads are available in the thread pool, the single task will be executed in a single thread only.
To have multiple threads executing multiple tasks, we need to create a new instance of the callable task and pass to the executor service.
