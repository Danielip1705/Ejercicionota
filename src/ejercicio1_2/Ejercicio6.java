package ejercicio1_2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//indicamos con la variable int los segundos
		int segundoscal;
		
		//indicamos con la variable int los minutos
		int minutos;
		
		//indicamos con la variable int las horas
		int horas;
		
		//creamos un scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en consola que nos diga los segundos
		System.out.println("Introduzca los segundos");

		//escribimos los segundos
		segundoscal = sc.nextInt();

		//indicamos que horas es una operacion para que nos de las horas
		horas = segundoscal/3600;
		
		//indicamos que minutos es una operacion para que nos de el resto de la operacion, es decir, los minutos
		minutos = segundoscal%60;
		
		//indicamos que los segundos es una operacion para que nos de los segundos 
		segundoscal = segundoscal/60;
		
		//indicamos con un ternario que si los segundos superan los 60, segundoscal es restado por 60(para que nos de los segundos sin superar 60) y si no supera los 60, que ponga los segundos
		segundoscal = segundoscal>60 ? segundoscal-60 : segundoscal;
		
		//imprimimos el resultado
		System.out.println( + horas +" horas " + minutos +" minutos " + segundoscal +" segundos"  );
		//cerramos scanner
		sc.close();
		

	}

}
