package com.sleepandwait;

public class sleepandwait {

	public static void main(String[] args) {
		Object lock = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized(lock) {
                try {
                    System.out.println("Thread 1 is going to sleep for 5 seconds.");
                    Thread.sleep(5000);
                    System.out.println("Thread 1 woke up after sleeping for 5 seconds.");
                    lock.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized(lock) {
                try {
                    System.out.println("Thread 2 is waiting for lock.");
                    lock.wait();
                    System.out.println("Thread 2 has acquired lock after being notified.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
    }









	}


