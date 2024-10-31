package com.cursojava;

import java.util.Scanner;

/*
 * Crea una función que ordene y retorne un array de números y un parámetro adicional
 * "Asc" o "Desc" para indicar si debe ordenarse de menor a mayor o de mayor a menor.
 * No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
 */
public class AppOrderArray
{
	private static final int LEN = 5;
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[LEN];
		int aux;
		String option;
		
		System.out.println("Ingrese los datos del array");
		for(int i = 0; i < LEN; ++i)
		{
			arr[i] = scanner.nextInt();
		}
		System.out.println("Ingrese la opción para odenar Asc (para ascendente) o Desc (para descendente)");
		option = scanner.next();
		
		if(option.equalsIgnoreCase("asc"))
		{
			for(int i = 0; i < LEN - 1; ++i)
			{
				for(int j = i + 1; j < LEN; ++j)
				{
					if(arr[i] > arr[j])
					{
						aux = arr[i];
						arr[i] = arr[j];
						arr[j] = aux;
					}
				}
			}
			showArray(arr);
		}
		else if(option.equalsIgnoreCase("desc"))
		{
			for(int i = 0; i < LEN - 1; ++i)
			{
				for(int j = i + 1; j < LEN; ++j)
				{
					if(arr[i] < arr[j])
					{
						aux = arr[i];
						arr[i] = arr[j];
						arr[j] = aux;
					}
				}
			}
			showArray(arr);
		}
		else
		{
			System.out.println("Opción no válida");
		}
		scanner.close();
	}
	
	public static void showArray(int[] arr)
	{
		for(int i = 0; i < arr.length; ++i)
		{
			System.out.println(arr[i]);
		}
	}
}



