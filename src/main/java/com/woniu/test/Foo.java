package com.woniu.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Foo implements Runnable{
	ExecutorService executorService = Executors.newFixedThreadPool(10);
	//ִ��һ���߳�����

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		executorService.execute(new Runnable() {
			public void run() {
			System.out.println("Asynchronous task");
			
			}
		});
			//�̳߳عر�
			executorService.shutdown();
	}

}
