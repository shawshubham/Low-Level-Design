package com.theshubhamco.designpattern.creational.singleton.lazy.threadsafe.doublecheckedlocking;

/*
* Double-Checked Locking to reduce the overhead of acquiring a lock by first checking the locking criterion
* without actually acquiring the lock. Only if the check indicates that locking is required does the actual
* lock proceed. This approach improves performance by minimizing synchronization overhead in scenarios
* where the singleton instance is already initialized.
* */
public class SingletonDemo {
    static void main(String[] args) {
        Thread thread1 = new Thread(new SingletonUsingThreads(), "Thread-1");
        Thread thread2 = new Thread(new SingletonUsingThreads(), "Thread-2");
        thread1.start();
        thread2.start();
    }
}

class SingletonUsingThreads implements Runnable{
    @Override
    public void run() {
        Singleton instance = Singleton.getInstance();
        System.out.println(Thread.currentThread().getName() +
                ": HashCode: " + instance.hashCode());
    }
}
