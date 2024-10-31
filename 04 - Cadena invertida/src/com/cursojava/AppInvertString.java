package com.cursojava;

import java.util.Scanner;

/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */
public class AppInvertString
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String original, inverted;
		
		System.out.println("Ingrese frase:");
		original = scanner.nextLine();
		
		inverted = "";
		for(int i = original.length() - 1; i >= 0; --i)
		{
			inverted += original.charAt(i);
		}
		System.out.println("-> " + inverted);
		scanner.close();
	}
}




