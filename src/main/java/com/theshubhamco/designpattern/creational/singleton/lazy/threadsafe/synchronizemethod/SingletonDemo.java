package com.theshubhamco.designpattern.creational.singleton.lazy.threadsafe.synchronizemethod;

/*
 * Singleton Thread-safe Lazy Initialization Demo with synchronized method
 *
 * Notice the output, both threads always get the same instance.
 * Race Condition will not occur due to synchronized method.
 *
 * */
public class SingletonDemo {
    static void main(String[] args) {
        System.out.println("Starting the main method");

        Thread thread1 = new Thread(new SingletonUsingThreads());
        Thread thread2 = new Thread(new SingletonUsingThreads());

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