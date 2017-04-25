package com.epam.java_training.main;

import java.util.ArrayList;
import java.util.List;

import com.epam.java_training.util.Util;

public class ThreadObject{

	private int[][] matrix_1;
	private int[][] matrix_2;
	
	private int[][] result_matrix;
	
	List<ThreadOperation> list_threadoperation;
	
	public ThreadObject(int n){
		
		this.matrix_1 = new int[n][n];
		this.matrix_2 = new int[n][n];
		 
		Util.enterMatrixWithRandom(this.matrix_1, n);
		Util.enterMatrixWithRandom(this.matrix_2, n);
		 
		this.result_matrix = new int[n][n];
		
		list_threadoperation = new ArrayList<ThreadOperation>();
	}
	
	public int[][] getMatrix_1(){
		
		return this.matrix_1;
		
	}
	
	public int[][] getMatrix_2(){
		
		return this.matrix_2;
		
	}
	
	public int[][] getResult_matrix(){
		
		return this.result_matrix;
		
	}
	
	public void runMultiply(){
		
		for (int i = 0; i < this.matrix_1.length; i++) {
			for (int j = 0; j < this.matrix_2.length; j++) {
				
				list_threadoperation.add(new ThreadOperation(i, j, this));
				list_threadoperation.get(list_threadoperation.size() - 1).start();
			}
		}

	}
	
	public void waitThread(){
		
		for(ThreadOperation thread_operation: this.list_threadoperation){
			try {
				thread_operation.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		};
		
	}
	
	public void printMatrix(){
		
		System.out.println("Matrix ¹1:");
		
		Util.printMatrix(this.matrix_1);
		
		System.out.println("Matrix ¹2:");
		
		Util.printMatrix(this.matrix_2);
		
	}
	
	public void printResult(){
		
		System.out.println("After multiply: The result massive has the following items:");
		Util.printMatrix(this.result_matrix);
		
	}
	
}
