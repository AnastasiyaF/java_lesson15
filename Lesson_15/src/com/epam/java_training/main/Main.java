/*
 *  Created by Anastasiya Findziukevich
 *  24/04/2017
 *  
 *  Task 15.
 *  
 *  ���������� ����������� ������������� ����������, ����������� ����������� ���������� ������� ������ (������) �������. 
 *  ��� ������������� ��� ������������� ������������ ������ �����������, ��������� � ������ Java 1.4.
 *  ��������� ������� ������, ����� ���������� �������� ������� �� ����������.
 */

package com.epam.java_training.main;


public class Main {
	
	
	public static void main(String[] args) {
		
		ThreadObject thread_object = new ThreadObject(20);// ��������� ������� ������������ 20 �� 20.
	
		thread_object.printMatrix();
		
		thread_object.runMultiply();
		
		thread_object.waitThread();

		thread_object.printResult();
		
	}

}
