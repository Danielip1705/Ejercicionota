package ejercicio1_2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// indicamos con float los milímetros
		float mm;
		
		// indicamos con float los centímetros
		float cm;
		
		// indicamos con float los metros
		float m;
		
		//creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos que nos de una distancia en mm
		System.out.println("Diga que distacia quiere expresar a milímetros");
		
		//escribe los milímetros
		mm= sc.nextFloat();
		
		//imprimimos que nos de una distancia en cm
		System.out.println("Diga que distacia quiere expresar a centímetros");
		
		//escribe los centimetros
		cm= sc.nextFloat();
		
		//imprimimos que nos de una distancia en m
		System.out.println("Diga que distacia quiere expresar a metros");
		
		//escribe metros
		m= sc.nextFloat();
		
		//imprimimos el resultado
		System.out.println("La distancia a centimetros serian:");
		
		//imprimimos los centimetros a centrimetros
		System.out.println( cm +" centrimetros = "+ cm);
		
		//imprimimos los milimetros a centimetros
		System.out.println( mm +" milímetros = "+ mm/10);
		
		//imprimimos los metros a centimetros
		System.out.println( m +" metros = "+ m*100);
		
		//cerramos el scanner
		sc.close();
	}

}
