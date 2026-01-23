package com.theshubhamco.designpattern.creational.singleton.eager;

public class Singleton {
    public static final Singleton INSTANCE = new Singleton();

    private Singleton(){
        // a private constructor prevents external instantiation
        // Imagine it as a heavy initialization process, like connecting to a database or kafka connection
        System.out.println("Creating Singleton Instance");
    }
    public static Singleton getInstance(){
        return INSTANCE;
    }

    public static void doSomething(){
        System.out.println("Doing Something");
    }
}
