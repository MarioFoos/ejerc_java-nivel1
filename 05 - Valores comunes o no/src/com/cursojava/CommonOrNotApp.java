package com.cursojava;

import java.util.Scanner;

public class CommonOrNotApp
{
	static final int LEN = 5;
	
	/* Crea una función que reciba dos array, un booleano y retorne un array.
	 * Si el booleano es verdadero buscará y retornará los elementos comunes
	 * de los dos array. Si el booleano es falso buscará y retornará los elementos
	 * no comunes de los dos array. No se pueden utilizar operaciones del lenguaje
	 * que lo resuelvan directamente. 
	 * */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int[] arr1 = new int[LEN];
		int[] arr2 = new int[LEN];
		String option;
		
		System.out.println("Ingrese 5 enteros para el primer array");
		for(int i = 0; i < 5; ++i)
		{
			arr1[i] = scanner.nextInt();	
		}
		System.out.println("Ingrese 5 enteros para el segundo array");
		for(int i = 0; i < 5; ++i)
		{
			arr2[i] = scanner.nextInt();	
		}
		System.out.println("Ingrese la opción. (Y) para buscar valores comunes (N) para no comunes");
		option = scanner.next();
		if(option.equalsIgnoreCase("Y"))
		{
			int index;
			for(int i = 0; i < LEN; ++i)
			{
				index = indexOf(arr1, arr2[i]);
				if(index != -1)
				{
					System.out.println("Valor en común: arr1[" + index + "] = arr2[" + i + "] = " + arr2[i]);
				}
			}
			
		}
		else if(option.equalsIgnoreCase("N"))
		{
			int index;
			for(int i = 0; i < LEN; ++i)
			{
				index = indexOf(arr2, arr1[i]);
				if(index == -1)
				{
					System.out.println("Valor de arr1 que NO está en arr2 -> arr1[" + i + "] = " + arr1[i]);
				}
			}			
			for(int i = 0; i < LEN; ++i)
			{
				index = indexOf(arr1, arr2[i]);
				if(index == -1)
				{
					System.out.println("Valor de arr2 que NO está en arr1 -> arr2[" + i + "] = " + arr2[i]);
				}
			}			
		}
		else
		{
			System.out.println("Opción no válida " + option);
		}
		scanner.close();
	}
	
	public static int indexOf(int[] arr, int value)
	{
		for(int i = 0; i < arr.length; ++i)
		{
			if(arr[i] == value)
			{
				return i;
			}
		}
		return -1;
	}
}
