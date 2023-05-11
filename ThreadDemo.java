package com.Mythread1;

//ThreadDemo using Thread class
class MyThread1 extends Thread {
 public void run() {
     System.out.println("MyThread1 is running.");
 }
}

//ThreadDemo using Runnable interface
class MyThread2 implements Runnable {
 public void run() {
     System.out.println("MyThread2 is running.");
 }
}

public class ThreadDemo {
 public static void main(String[] args) {
     // ThreadDemo using Thread class
     MyThread1 thread1 = new MyThread1();
     thread1.start();

     // ThreadDemo using Runnable interface
     MyThread2 thread2 = new MyThread2();
     Thread t = new Thread(thread2);
     t.start();
 }
}
