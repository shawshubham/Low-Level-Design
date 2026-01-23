package com.theshubhamco.designpattern.creational.singleton.lazy.basic;

/*
* Singleton Lazy Initialization Demo
*
* Observe the output, you will see that the instance is created only
* when getInstance() is called for the first time.
*
* Output:
* Starting the main method
* doing something
* Creating Singleton Instance
* Both Instances are same: true
* */
public class SingletonDemo {
    static void main(String[] args) {
        System.out.println("Starting the main method");
        Singleton.doSomething();

        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(String.format("Both Instances are same: %b", instance == instance2));
    }
}
