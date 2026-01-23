package com.theshubhamco.designpattern.creational.singleton.lazy.threadsafe.synchronizemethod;

public class Singleton {
    private static Singleton instance;

    private Singleton(){
        // a private constructor prevents external instantiation
        System.out.println("Creating Singleton Instance");
    }

    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
