package com.theshubhamco.designpattern.creational.singleton.lazy.threadsafe.doublecheckedlocking;

public class Singleton {
    private static volatile Singleton instance;

    private Singleton(){
        // a private constructor prevents external instantiation
        System.out.println("Creating Singleton Instance");
    }

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
