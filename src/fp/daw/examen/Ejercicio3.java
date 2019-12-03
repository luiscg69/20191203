package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio3 {

	/*
	 * 3 puntos
	 * 
	 * Decimos que un número entero positivo es guay si puede obtenerse como suma de
	 * dos o más números enteros consecutivos. Por ejemplo, 3 (=1+2), 5 (=2+3),
	 * 6(=1+2+3), son números guays.
	 * 
	 * Escribir en el método main un programa que lea un número entero positivo e
	 * indique si éste es guay.
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numero;
		
		String continuar = "si";
		do {
		System.out.print("introduce un Numero entero positivo:");

		numero = input.nextInt();
		input.nextLine();
		

		int x;
		int suma = 0;

		
			
			
			

			for (x = numero - 1; x > 0; x = x - 1) {

				suma = suma + x;
			}
				if (suma > numero) {

					suma = x;
				}
				

				 if (numero == suma) {
					System.out.println("el numero " + numero + " esta  guay");

				}
				if (numero != suma)

				{
					System.out.println("El numero " + numero + " no esta guay");
				}
	
				
			
			
			
			System.out.println("¿Quieres jugar otra vez? (si/no)");
			continuar = input.nextLine();
			
			
		} while (continuar.equals("si"));

		System.out.println("Muchas gracias por jugar nos vemos pronto");

		input.close();

	}
}
