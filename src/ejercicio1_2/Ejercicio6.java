package ejercicio1_2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int segundos;
		final int minutos;
		int horas;
		int resultadomin;
		int resultadohor;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca los segundos que quieras pasar a min y hr");

		segundos = sc.nextInt();

		horas = segundos/3600;
		
		minutos = segundos/60;
		
		segundos = segundos%60;
		
		
		
		System.out.println( + horas +" horas " + minutos +" minutos " + segundos +" segundos"  );
		

	}

}
