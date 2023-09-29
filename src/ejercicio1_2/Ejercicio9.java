package ejercicio1_2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//indicamos con int num1
		int num1;
		
		//indicamos con int num2
		int num2;
		
		//indicamos con boolean resultado
		boolean resultado;
		
		//creamos un scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en consola que escriba el primer numero
		System.out.println("Escriba el primer numero");
		
		//escribe num1
		num1 = sc.nextInt();
		
		//imprimimos en consola que escriba el segundo numero
		System.out.println("Escribe el segundo numero");
		
		//escribe el num2
		num2 = sc.nextInt();
		
		//indicamos que resultado es true si num1 es igual a num2
		resultado = num1==num2;
		
		//imprimimos en pantalla el resultado, los espacios seria false y resultado es true
		System.out.println(" " + resultado);
		
		//cerramos scanner
		sc.close();
		
		
	
	}

}
