package ejercicio01;

import java.util.Scanner;

public class ejercicio01 {

	public static void main(String[] args) {
		// Programa que lea una cantidad de grados cent�grados y la pase a grados Fahrenheit. 
		// La f�rmula correspondiente para pasar de grados cent�grados a fahrenheit es:
		// F = 32 + ( 9 * C / 5)	
		
		float centigrados=0;
		System.out.println("La correspondencia en grados Fahrenheit son "+conversion(centigrados)+ " grados");
		
		
		
	}
public static float conversion(float centigrados){
	float gradosf=0;
	float gradosc=0;
	Scanner entrada=new Scanner (System.in);
	 System.out.println("Escribe los grados cent�grados a convertir: ");
	 gradosc=entrada.nextFloat();
	 gradosf=32+(9*gradosc/5);
	 // Math.round(gradosf);
	 return gradosf;
	
}
}
