package ejercicio02;

import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {

		// 2. Programa que lee por teclado el valor del radio
		// de una circunferencia y calcula y muestra por
		// pantalla la longitud y el área de la circunferencia.
		float radio = 0;
		
		radio = leerFloat();
		
		System.out.println("La longitud de este círculo es de: " + longitud(radio));
		System.out.println("El área de este cículo es de : " + area(radio));

	}
	
	public static float leerFloat(){
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el radio de la circunferencia: ");
		float radio = entrada.nextFloat();
		return radio;
	}

	public static float longitud(float radio) {
		float radiocir = 0;
		float longitud = 0;
		longitud = (float) (2 * radio * Math.PI);
		return longitud;
	}

	public static float area(float radio) {
		double area = 0;
		area = Math.PI * (radio * radio);
		return (float) area;
	}
}
