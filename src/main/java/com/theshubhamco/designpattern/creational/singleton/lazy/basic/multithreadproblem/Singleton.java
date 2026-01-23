package com.theshubhamco.designpattern.creational.singleton.lazy.basic.multithreadproblem;

//Lazy Initialization
public class Singleton {
    private static Singleton instance;

    private Singleton(){
        // a private constructor prevents external instantiation
        // Imagine it as a heavy initialization process, like connecting to a database or kafka connection
        System.out.println("Creating Singleton Instance");
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public static void doSomething(){
        System.out.println("Doing Something");
    }
}
