package es.studium.Descuentos;

import java.util.Scanner;

public class Descuentos {

	public static void main(String[] args)
	{
		double precio, subtotal, total;
		int codigo, unidades, descuento;
		
		// creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
										
		System.out.println("Indicar el codigo artículo:");
		codigo = teclado.nextInt();
		
		System.out.println("Indicar el precio artículo:");
		precio = teclado.nextDouble();
		
		System.out.println("Indicar el cantidad de unidades:");
		unidades = teclado.nextInt();
		
		teclado.close();
		
		subtotal = unidades * precio;
		
		if(unidades > 100)
		{
			descuento = 40;
			total = unidades*0.60*precio;					
		}
		else
		{
			if(unidades>=25 && unidades>=100)
			{
				descuento = 20;
				total = unidades*0.80*precio;
			}
			else 
			{
				if(unidades>=10 && unidades>=24)
				{
					descuento = 10;
					total = unidades*0.90*precio;
				}
				else
				{
					descuento = 0;
					total = subtotal;
				}
			}

		}
		
		System.out.println("********************RESUMEN COMPRA********************");
		System.out.println("Código Subtotal Descuento Total");
		
		System.out.println(codigo + " " + subtotal + " " + descuento + " " + total);

	}
}
