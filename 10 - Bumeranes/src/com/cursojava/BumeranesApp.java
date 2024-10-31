package com.cursojava;

public class BumeranesApp
{
	private static final int LEN = 40;
	
	/* Crea una función que retorne el número total de bumeranes de un array de números
	 * enteros e imprima cada uno de ellos. Un bumerán (búmeran, boomerang) es una secuencia
	 * formada por 3 números seguidos, en el que el primero y el último son iguales,
	 * y el segundo es diferente. Por ejemplo [2, 1, 2]. En el array [2, 1, 2, 3, 3, 4, 2, 4]
	 * hay 2 bumeranes ([2, 1, 2] y [4, 2, 4]).
	 */

	public static void main(String[] args)
	{
		int[] arr = new int[LEN];
		
		for(int i = 0; i < LEN; ++i)
		{
			arr[i] = (int)(Math.random()*10);
		}
		for(int i = 0; i < LEN; ++i)
		{
			System.out.print(arr[i] + " ");
		}
		printBumerans(arr);
	}
	
	public static void printBumerans(int[] arr)
	{
		int count = 0;
		System.out.println();
		for(int i = 0; i < arr.length - 2; ++i)
		{
			if(arr[i] == arr[i + 2])
			{
				++count;
				System.out.println("Bumeran " + count + ": {" + arr[i] + ", " + arr[i + 1] + ", " + arr[i + 2] + "}");
			}
		}
	}

}
