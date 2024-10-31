package com.cursojava;
import java.util.Scanner;

/*
 * Escribe un programa que realice una de las cuatro operaciones básicas entre dos números
 * y tenga en cuenta el caso de la divsión por cero 
 */
public class AppOperations
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Operación:");
		System.out.println("1) Suma");
		System.out.println("2) Resta");
		System.out.println("3) Multiplicación");
		System.out.println("4) División");
		
		int option = scanner.nextInt();
		double num1, num2;
		
		switch(option)
		{
			case 1:
				System.out.println("Ingrese cada número y luego de enter:");
				num1 = scanner.nextDouble();
				num2 = scanner.nextDouble();
				System.out.println("Resultado: " + (num1 + num2));
				break;
			case 2:
				System.out.println("Ingrese cada número y luego de enter:");
				num1 = scanner.nextDouble();
				num2 = scanner.nextDouble();
				System.out.println("Resultado: " + (num1 - num2));
				break;
			case 3:
				System.out.println("Ingrese cada número y luego de enter:");
				num1 = scanner.nextDouble();
				num2 = scanner.nextDouble();
				System.out.println("Resultado: " + (num1*num2));
				break;
			case 4:
				System.out.println("Ingrese cada número y luego de enter:");
				num1 = scanner.nextDouble();
				num2 = scanner.nextDouble();
				if(num2 == 0)
				{
					System.out.println("División por cero no válida");
				}
				else
				{
					System.out.println("Resultado: " + (num1/num2));	
				}
				break;
			default:
				System.out.println("Opción no válida");
		}
		scanner.close();
	}
}
