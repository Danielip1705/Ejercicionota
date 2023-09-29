package ejercicio1_2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float mm;
		float cm;
		float m;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Diga que distacia quiere expresar a milímetros");
		mm= sc.nextFloat();
		
		System.out.println("Diga que distacia quiere expresar a centímetros");
		cm= sc.nextFloat();
		
		System.out.println("Diga que distacia quiere expresar a metros");
		m= sc.nextFloat();
		System.out.println("La distancia a centimetros serian:");
		System.out.println( cm +" centrimetros = "+ cm);
		System.out.println( mm +" milímetros = "+ mm/10);
		System.out.println( m +" metros = "+ m*100);
		sc.close();
	}

}
