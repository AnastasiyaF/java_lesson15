/*
 *  Created by Anastasiya Findziukevich
 *  24/04/2017
 *  
 *  Task 15.
 *  
 *  Необходимо разработать многопоточное приложение, позволяющее перемножать квадратные матрицы одного (любого) порядка. 
 *  При необходимости для синхронизации использовать только инструменты, доступные в версии Java 1.4.
 *  Приведите решение задачи, когда количество дочерних потоков не ограничено.
 */

package com.epam.java_training.main;


public class Main {
	
	
	public static void main(String[] args) {
		
		ThreadObject thread_object = new ThreadObject(20);// создаются матрицы размерностью 20 на 20.
	
		thread_object.printMatrix();
		
		thread_object.runMultiply();
		
		thread_object.waitThread();

		thread_object.printResult();
		
	}

}
