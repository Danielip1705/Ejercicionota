package ejercicio1_2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//indicamos la variable int para num
		int num;
		
		//indicamos la variable int para num1
		int num1;
		
		//indicamos la variable int para solucion		
		int solucion;
		
		//indicamos la variable int para resto
		int resto;
		
		//creamos un scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en consola que numero quiere comprobar
		System.out.println("Escribe el numero que quieres comprobar");
		
		//indicamos que escriba el num
		num = sc.nextInt();
		
		//indicamos que escriba el nu1
		num1 = sc.nextInt();
		
		//hacemos que el identificador resto sea el resto de num y num1
		resto = num%num1;
		solucion = resto==0 ? 0  :  num1-num;
		System.out.println("Para que " + num1 + " sea multiplo de " + num + " hay que sumarle "+ solucion);
		sc.close();
		
		
		
		
	}

}