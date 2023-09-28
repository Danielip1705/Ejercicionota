package ejercicio1_2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int segundos;
		int minutos;
		int horas;
		int resultadomin;
		int resultadohor;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca los segundos que quieras pasar a min y hr");

		segundos = sc.nextInt();

		minutos = segundos%60;

		horas = segundos%3600;
		
		resultadomin = minutos == 0 ? 0 : minutos/60;
		
		resultadohor = horas == 0 ? 0 : horas/3600;
		
		System.out.println( + resultadohor +" horas " + resultadomin +" minutos " + segundos +" segundos"  );
		

	}

}
