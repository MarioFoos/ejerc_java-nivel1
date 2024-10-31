package com.cursojava;

/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */
public class AppFibonacci
{
	public static void main(String[] args)
	{
		long num1, num2, fibo;

		num1 = 0;
		num2 = 1;
		
		System.out.println("1 -> " + num1);
		System.out.println("2 -> " + num2);
		for(int i = 3; i <= 50; ++i)
		{
			fibo = num1 + num2;

			System.out.println(i + " -> " + fibo);
			
			num1 = num2;
			num2 = fibo;
		}
	}
}




