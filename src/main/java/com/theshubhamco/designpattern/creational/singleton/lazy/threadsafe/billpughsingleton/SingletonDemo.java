package com.theshubhamco.designpattern.creational.singleton.lazy.threadsafe.billpughsingleton;

public class SingletonDemo {
    static void main(String[] args) {
        Thread thread1 = new Thread(new SingletonThreadSafe());
        Thread thread2 = new Thread(new SingletonThreadSafe());
        thread1.start();
        thread2.start();
    }
}

class SingletonThreadSafe  implements Runnable{
    @Override
    public void run() {
        Singleton instance = Singleton.getInstance();
        System.out.println("Thread: " + Thread.currentThread().getName()
                + ": HashCode: " + instance.hashCode());
    }
}
