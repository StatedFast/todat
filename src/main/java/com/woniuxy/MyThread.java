package com.woniuxy;


   
 
public class MyThread implements Runnable{
	@Override
	public void run() {
		while(true) {
		 System.out.println(Thread.currentThread().getName());
		}
	}
	public static void main(String args[]){
		System.out.println("¿ªÊ¼===");
	    Thread t1 = new Thread(new MyThread());
	    Thread t2 = new Thread(new MyThread());
	    Thread t3 = new Thread(new MyThread());
	    Thread t4 = new Thread(new MyThread());
	    t1.start();
	    t2.start();
	    t3.start();
	    t4.start();
	}
}