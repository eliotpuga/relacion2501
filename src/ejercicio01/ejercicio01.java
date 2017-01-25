package ejercicio01;

import java.util.Scanner;

public class ejercicio01 {

	public static void main(String[] args) {
		// Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. 
		// La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:
		// F = 32 + ( 9 * C / 5)	
		
		float centigrados=0;
		System.out.println("La correspondencia en grados Fahrenheit son "+conversion(centigrados)+ " grados");
		
		
		
	}
public static float conversion(float centigrados){
	float gradosf=0;
	float gradosc=0;
	Scanner entrada=new Scanner (System.in);
	 System.out.println("Escribe los grados centígrados a convertir: ");
	 gradosc=entrada.nextFloat();
	 gradosf=32+(9*gradosc/5);
	 // Math.round(gradosf);
	 return gradosf;
	
}
}
