package com.theshubhamco.designpattern.creational.singleton.lazy.basic.multithreadproblem;

/*
* Singleton Lazy Initialization Demo with Multithreading Problem
*
* Notice the output, you will see that the instance is created twice.
* Due to race condition two different instances are created.
*
* Output:
* Starting the main method
* Creating Singleton Instance
* Thread-1: HashCode: 630515998
* Thread-0: HashCode: 630515998
*
* Output:
* Starting the main method
* Creating Singleton Instance
* Creating Singleton Instance
* Thread-0: HashCode: 630515998
* Thread-1: HashCode: 569589571
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