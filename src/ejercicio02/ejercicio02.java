package ejercicio02;

import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {
		
		// 2. Programa que lee por teclado el valor del radio 
		// de una circunferencia y calcula y muestra por 
		// pantalla la longitud y el área de la circunferencia.
		float radio=0;
		float area=0;
		System.out.println("La longitud de este círculo es de: "+longitud(radio));
		System.out.println("El área de este cículo es de : "+area(radio));
		
	}
public static float longitud(float radio){
	float radiocir=0;
	double longitud=0;
	Scanner entrada=new Scanner (System.in);
	System.out.print("Escribe el radio de la circunferencia: ");
	radiocir=entrada.nextFloat();
	longitud=2*radiocir*Math.PI;
	return (float) longitud;
}
public static float area (float radio){
	float radiocirculo=0;
	double area=0;
	Scanner entrada=new Scanner (System.in);
	System.out.print("Escribe el radio de la circunferencia: ");
	radiocirculo=entrada.nextFloat();
	area=Math.PI*(radiocirculo*radiocirculo);
	return (float) area;
}
}
