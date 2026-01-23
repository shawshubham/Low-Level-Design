package com.theshubhamco.designpattern.creational.singleton.lazy.threadsafe.synchronizeblock;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // a private constructor prevents external instantiation
        System.out.println("Creating Singleton Instance");
    }

    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
