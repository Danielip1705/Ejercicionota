package ejercicio1_2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int segundoscal;
		int minutos;
		int horas;
				Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca los segundos que quieras pasar a min y hr");

		segundoscal = sc.nextInt();

		horas = segundoscal/3600;
		
		minutos = segundoscal%60;
		
		segundoscal = segundoscal/60;
		
		segundoscal = segundoscal>60 ? segundoscal-60 : segundoscal;
		
		
		System.out.println( + horas +" horas " + minutos +" minutos " + segundoscal +" segundos"  );
		

	}

}
