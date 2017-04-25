package com.justted.chapter15;

public class ThreadTester{
  public static void main(String[] args){
    Runnable threadJob=new MyRunnable();
    Thread myThread=new Thread(threadJob);
    myThread.start();

   
    System.out.println("back in main");
  }
}