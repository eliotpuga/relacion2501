package ejercicio04;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		// 4. Programa lea la longitud de los catetos de un triángulo 
		// rectángulo y calcule la longitud de la hipotenusa según el 
		// teorema de Pitágoras
		float cateto=leercateto();
		
		System.out.print("La hipotenusa tiene una longitud de: "+conocerhipotenusa(cateto));
		
		

	}
	public static float leercateto(){
		float cateto=0;		
		Scanner entrada=new Scanner (System.in);
		System.out.print("Escribe la longitud de los catetos: ");
		cateto=entrada.nextFloat();
		return cateto;
	}
public static float conocerhipotenusa(float cateto){
		float hipotenusa=0;
		hipotenusa=(float)Math.sqrt(cateto);
		return hipotenusa;
		
		
}
}
