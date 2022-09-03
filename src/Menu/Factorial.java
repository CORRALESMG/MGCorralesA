/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.util.Scanner;

/**
 *
 * @author GCAM
 */
public class Factorial {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner( System.in );
		double factorial;
		 int num;
		 System.out.print("Introduce un número: ");
		 num=teclado.nextInt();
		 factorial=1;
		 for (int i=num;i>0;i--)
		 {
		 factorial=factorial*i;

		 }
		 System.out.println("El factorial de " + num + " es: " + factorial);

	}

}
