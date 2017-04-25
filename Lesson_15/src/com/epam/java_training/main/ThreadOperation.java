package com.epam.java_training.main;

import com.epam.java_training.util.Util;

public class ThreadOperation extends Thread{

	private int i;
	private int j;
	private ThreadObject threadobject;
	
	public ThreadOperation(int i, int j, ThreadObject threadobject){
		
		this.i = i;
		this.j = j;
		this.threadobject = threadobject;
	}
	
	public void run(){
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Util.multplyRowMatrix(threadobject.getMatrix_1(), threadobject.getMatrix_2(), i, j, threadobject.getResult_matrix());
	}
}
