package com.theshubhamco.designpattern.creational.singleton.eager;

public class SingletonDemo {
    static void main(String[] args) {
        System.out.println("Starting the main method");
        Singleton.doSomething();

        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(String.format("Both Instances are same: %b", instance == instance2));
    }
}
