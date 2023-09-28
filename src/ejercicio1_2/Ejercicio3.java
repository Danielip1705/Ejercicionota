package ejercicio1_2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int num1;
		int solucion;
		int resto;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el numero que quieres comprobar");
		num = sc.nextInt();
		num1 = sc.nextInt();
		resto = num%num1;
		solucion = resto==0 ? 0  :  num1-num;
		System.out.println("Para que " + num1 + " sea multiplo de " + num + " hay que sumarle "+ solucion);
		sc.close();
		
		
		
		
	}

}