## Thread Local in Java

Thread local in Java is used to store any value/object, that is to be used uniquely by each thread accessing them.

This is more optimized way of preventing data corruption due to multi-thread access to a particular data(variable)

```ThreadLocal<Integer></Integer> thread_local = new ThreadLocal<>(); ```
<br></br>
This statement lets us to create a storage to store some integer values that is to be accessed uniquely by different threads.

We can also override the methods in thread local to provide us some default values in case no value is been set.

```
ThreadLocal<Integer> t_local = new ThreadLocal<Integer>() {  
        protected Integer initialValue() {
            return (int) System.currentTimeMillis();                  
        }
};
```

