package fp.daw.examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejercicio2 {

	/*
	 * 3 puntos
	 * 
	 * Escribir en el método main un programa que lea del teclado dos números
	 * enteros y calcule la suma de todos los números impares comprendidos entre
	 * ellos, ambos incluidos.
	 * 
	 * El programa deberá calcular el resultado sin importar el orden en que se
	 * introduzcan los dos números (primero el mayor o primero el menor).
	 * 
	 * Si es posible, minimizar el número de iteraciones que se ejecutarán para
	 * obener el resultado.
	 * 
	 * No se permite el uso de la clase Scanner para leer del teclado.
	 * 
	 * Sólo se permite el uso de recursos del lenguaje Java vistos en las unidades 2
	 * y 3.
	 */

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String num1;
		String num2;

		int numM;
		int numMe;

		String volverajugar = "si";

		do {

			int suma = 0;
			System.out.print("Introduce un numero entero: ");
			num1 = reader.readLine();
			int numeroV1 = Integer.parseInt(num1);
			System.out.print("Introduzca otro número entero: ");
			num2 = reader.readLine();
			int numeroV2 = Integer.parseInt(num2);

			if (numeroV1 > numeroV2) {
				numM = numeroV1;
				numMe = numeroV2;
			} else {
				numM = numeroV2;
				numMe = numeroV1;
			}

			for (int x = numMe; x <= numM; x = x + 1) {

				if (x % 2 != 0) {
					suma = suma + x;
				}
			}

			System.out.println("la suma delos numeros impares entre el numero: " + numMe + " y el numero: " + numM
					+ " es igual a " + suma);

			System.out.println("¿Quieres volver a jugar? (si/no) :");
			volverajugar = reader.readLine();

		} while (volverajugar.equals("si"));

		System.out.println("Muchas gracias por jugar nos vemos pronto");

	}

}
