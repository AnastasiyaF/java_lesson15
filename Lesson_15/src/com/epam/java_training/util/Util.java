package com.epam.java_training.util;

import java.util.Random;


public class Util {
	public static void enterMatrixWithRandom(int[][] matrix, int n) {
		
		Random rand = new Random();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
					matrix[i][j] = rand.nextInt(10);
			}	
		}
	}

	
	public static void printMatrix(int[][] matrix) {
		
		System.out.println("The matrix has the following items:");
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void printArray(int[] mas) {

		for (int i = 0; i < mas.length; i++) {
		System.out.print("mas[" + i + "]=" + mas[i] + "; ");
		}
		System.out.println();
	}
	
	public static void multplyRowMatrix(int[][] matrix_1, int[][] matrix_2, int i, int j, int[][] result_matrix) {

		int result = 0;
		
		System.out.println("Start: i = " + i + ", j = " +j);
		for (int k = 0; k < matrix_2.length; k++) {
			result = result + matrix_1[i][k] * matrix_2[k][j];
		}	
		
		result_matrix[i][j] = result;
		
		System.out.println("End: i = " + i + ", j = " +j);
	}
	
}
