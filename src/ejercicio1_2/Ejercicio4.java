package ejercicio1_2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// indicamos con la variable int la base
		int base;
		
		// indicamos con la variable int la base
		int altura;
		
		// indicamos con la variable double la solucion
		double solucion;
		
		//creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en consola que nos indique la base y la altura
		System.out.println("Dime que base y altura ");
		
		//escribe la base
		base = sc.nextInt();
		
		//escribe la altura
		altura = sc.nextInt();
		
		//guardamos en solucion la operacion del triangulo
		solucion = (base*altura)/2;
		
		//imprimimos en consola el resultado
		System.out.println("El resultado es: " + solucion);
		
		//cerramos scanner
		sc.close();
	}

}
