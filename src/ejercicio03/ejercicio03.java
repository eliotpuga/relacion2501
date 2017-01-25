package ejercicio03;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		//3. Programa que pase una velocidad en Km/h a m/s. La velocidad 
		// se lee por teclado.		
		float velocidadkm=leervelocidad();
		
		System.out.println("La conversión a m/s es de : "+conversionvelocidades(velocidadkm));

	}
public static float leervelocidad(){
	float velocidadkm=0;
	Scanner entrada=new Scanner (System.in);
	System.out.print("Escribe la velocidad en km/h: ");
	velocidadkm=entrada.nextFloat();
	return velocidadkm;
}
public static float conversionvelocidades(float velocidadkm){
	float velocidadms=0;
	velocidadms=(float) (velocidadkm*0.2778);
	return velocidadms;
}
}
