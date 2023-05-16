package com.matrixmultiplication;
//Java program to multiply two matrices.

public class GFG
{

	
	public static int[][] matrixMultiplication(
		int[][] matrix1, int rows1, int cols1,
		int[][] matrix2, int rows2, int cols2)
		throws Exception
	{

		
		if (cols1 != rows2) {
			throw new Exception("Invalid matrix given.");
		}

		
		int resultMatrix[][] = new int[rows1][cols2];

		
		for (int i = 0; i < resultMatrix.length; i++)
		{
			for (int j = 0;
				j < resultMatrix[i].length;
				j++)
			{
				for (int k = 0; k < cols1; k++)
				{
					resultMatrix[i][j]
						+= matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		return resultMatrix;
	}

	
	public static void main(String[] args) throws Exception
	{

		
		int matrix1[][] = { { 2, 4 }, { 3, 4 } };
		int matrix2[][] = { { 1, 2 }, { 1, 3 } };

		
		int resultMatrix[][] = matrixMultiplication(
			matrix1, 2, 2, matrix2, 2, 2);

		
		System.out.println("Result Matrix is:");
		for (int i = 0; i < resultMatrix.length; i++)
		{
			for (int j = 0;
				j < resultMatrix[i].length;
				j++)
			{
				System.out.print(resultMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}


		

	


