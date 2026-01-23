package com.theshubhamco.designpattern.creational.singleton.lazy.threadsafe.enumsingleton;

public class SingletonDemo {
    static void main(String[] args) {
        Singleton object1 = Singleton.INSTANCE;
        Singleton object2 = Singleton.INSTANCE;

        System.out.println(String.format("Both the enum instance are same: %b", object1 == object2));
    }
}
