package com.cursojava;

import java.util.Scanner;

public class SecondApp
{
	static final int LEN = 5;
	
	/* Dado un listado de números, encuentra el SEGUNDO más grande.
	 */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int first = -1, second = -1, readed, count;
		
		System.out.println("Ingrese número, termine con -1");
		
		count = 0;
		// El -1 no pertenece a la lista
		System.out.println("Ingrese una lista de número entero terminada con -1");
		readed = scanner.nextInt();
		first = readed;
		second = readed;
		while(readed != -1)
		{
			readed = scanner.nextInt();
			// Primer lectura, son los dos iguales al leido
			if(count == 0)
			{
				first = readed;
				second = readed;
			}
			else
			{
				if(readed > first)
				{
					second = first;
					first = readed;
				}
			}
			++count;
		}
		if(count == 0)
		{
			System.out.println("Lista vacía");
		}
		else if(count == 1)
		{
			System.out.println("Lista con solo elemento, el mayor y segundo mayor son iguales a " + second);
		}
		else
		{
			if(first == second)
			{
				System.out.println("Lista de número iguales, el mayor y segundo mayor son iguales a " + second);	
			}
			else
			{
				System.out.println("Segundo mayor es " + second);	
			}
		}
		scanner.close();
	}
}
