package ejercicio1_2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//indicamos el num1 para que contenga decimales
		double num1;
		//indicamos el num entero
		int num;
		
		//creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimpos en pantalla la pregunta 
		System.out.println("Escriba el numero que quiera redondear");
		
		//indicamos que se puede escribir el num1
		num1 = sc.nextDouble();
		
		//Ponenos la variable int para que redonde con cast
		num = (int) (num1+0.5);
		System.out.println("El numero redondeado es " +num);
		//cerramos el scanner
		sc.close();
		
		
		
		
		
	}

}
