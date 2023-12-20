package org.example;

public class Main extends Thread{

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        counter.counter();
    }

}