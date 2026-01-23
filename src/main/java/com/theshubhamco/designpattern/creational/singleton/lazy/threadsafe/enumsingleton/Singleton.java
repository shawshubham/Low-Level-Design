package com.theshubhamco.designpattern.creational.singleton.lazy.threadsafe.enumsingleton;

public enum Singleton {
    INSTANCE;

    Singleton(){
        System.out.println("Creating Singleton Instance");
    }

    public void doSomething(){
        System.out.println("Doing Something");
    }
}
