package com.cursojava;

public class UpperCaseWordsApp
{

	public static void main(String[] args)
	{
		String str = " una oración de prueba para pasar a mayúsculas y";

		System.out.println(toUpperWords(str));
	}

	public static char toUpper(char car)
	{
		switch(car)
		{
			case 'á':
				return 'Á';
			case 'é':
				return 'É';
			case 'í':
				return 'Í';
			case 'ó':
				return 'Ó';
			case 'ú':
				return 'Ú';
			case 'ü':
				return 'Ü';
			default:
				if(car >= 'a' && car <= 'z')
				{
					return (char) (car - 'a' + 'A');
				}
		}
		return car;
	}
	
	public static String toUpperWords(String str)
	{
		int len = str.length();
		
		// Busco un espacio, recorto hasta ahí y pongo en mayúsculas la primer letra
		for(int i = 0; i < len - 1; ++i)
		{
			char cur = str.charAt(i);
			char next = str.charAt(i + 1);
			
			// Para la primer palabra
			if(i == 0 && cur != ' ')
			{
				str = toUpper(cur) + str.substring(i + 1);
			}
			else
			{
				if(cur == ' ' && next != ' ')
				{
					str = str.substring(0, i + 1) + toUpper(next) + str.substring(i + 2);
				}
			}
		}
		return str;
	}
}
