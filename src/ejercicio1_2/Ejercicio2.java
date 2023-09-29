package ejercicio1_2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//indicamos con la variable int el num
		int num;
		
		//indicamos con la variable int el num1
		int num1;
		
		//indicamos con la variable int la solucion
		int solucion;
		
		//creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en pantalla que numero quiere comprobar
		System.out.println("Escribe el numero que quieres comprobar");
		
		//escribe el numero
		num = sc.nextInt();
		
		//indicamos que num1 es igual a el resto de el num
		num1 = num%7;
		
		//indicamos con un ternario que si num1 es 0 que ponga en consola que es 0 y si no indicamos que a 7 le reste el resto para saber cuantos numeros faltan para que sea multiplo
		solucion = num1==0 ? 0  :  7-num1;
		
		//imprimimos en pantalla la solucion con el indentificador solucion
		System.out.println("La solucion es " + solucion);
		
		//cerramos scanner
		sc.close();
		
		
		
	}

}
