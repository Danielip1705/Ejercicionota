package ejercicio1_2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		boolean resultado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba el primer numero");
		
		num1 = sc.nextInt();
		
		System.out.println("Escribe el segundo numero");
		
		num2 = sc.nextInt();
		resultado = num1==num2;
		System.out.println(" " + resultado);
		sc.close();
		
		
	
	}

}
