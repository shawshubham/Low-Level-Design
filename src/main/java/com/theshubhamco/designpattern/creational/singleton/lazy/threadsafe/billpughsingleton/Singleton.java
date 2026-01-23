package com.theshubhamco.designpattern.creational.singleton.lazy.threadsafe.billpughsingleton;

public class Singleton {

    private Singleton(){
        // a private constructor prevents external instantiation
        System.out.println("Creating Singleton Instance");
    }

    private static class Holder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return Holder.INSTANCE;
    }
}
