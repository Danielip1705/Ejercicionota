package ejercicio1_2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//indicamos con la variable double num
		double num;
		
		//indicamos con la variable int a
		int a;
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en pantalla la pregunta
		System.out.println("¿A cuanta distancia has lanzado el algoritmo?");
		
		//escribe num
		num = sc.nextDouble();
		
		//con un conversor pasamos de double a int y un cast para eliminar los decimales
		a = (int)num;
		
		//imprimimos la solucion y pasamos los metros a centimetros
		System.out.println("Has lanzado el algoritmo a una distancia de " + a*100);
		
		//cerramos scanner
		sc.close();
	}

}
