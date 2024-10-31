package com.cursojava;
import java.util.Scanner;

/*
 * Escribe un programa que lea una lista de números positivos (terminada con un negativo)
 * y calcule el promedio
 */

public class AppMean
{
	public static void main(String[] args)
	{
		double num, sum = 0;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresar números positivos (ingresar negativo para terminar):");
		
		num = scanner.nextDouble();
		while(num >= 0)
		{
			sum += num;
			++count;
			num = scanner.nextDouble();
		}
		if(count == 0)
		{
			System.out.println("Lista vacía");
		}
		else
		{
			System.out.println("En la lista hay "+ count + " números y el promedio es " + (sum/count));
		}
		scanner.close();
	}
}




