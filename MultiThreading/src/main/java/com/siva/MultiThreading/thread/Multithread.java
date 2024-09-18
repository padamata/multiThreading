package com.siva.MultiThreading.thread;

public class Multithread {

    public static void main(String[] args) {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            MultithreadingDemo thread = new MultithreadingDemo();
            thread.start();
        }
    }
}