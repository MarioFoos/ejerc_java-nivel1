package com.cursojava;

import java.util.Scanner;

/* Crea una función que reciba dos cadenas como parámetro (str1, str2) e imprima dos cadenas
 * como salida (out1, out2). Una con todos los caracteres presentes en la str1 pero NO en str2.
 * Otra con todos los caracteres presentes en la str2 pero NO en str1.
 * */
public class CharCommonAndNotApp
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String str1, str2;
		
		System.out.println("Ingrese las dos palabras:");
		
		str1 = scanner.nextLine();
		str2 = scanner.nextLine();
		
		commonAndNot(str1, str2);

		scanner.close();
	}
	
	private static void commonAndNot(String str1, String str2)
	{

		// Busco los caracteres que están en str1 pero no en str2
		for(int i = 0; i < str1.length(); ++i)
		{
			if(str2.indexOf(str1.charAt(i)) < 0)
			{
				System.out.println("Está en str1 pero no en str2: " + str1.charAt(i));
			}
		}
		// Busco los caracteres que están en str2 pero no en str1
		for(int i = 0; i < str1.length(); ++i)
		{
			if(str1.indexOf(str2.charAt(i)) < 0)
			{
				System.out.println("Está en str2 pero no en str1: " + str2.charAt(i));
			}
		}
	}
	
	
}
