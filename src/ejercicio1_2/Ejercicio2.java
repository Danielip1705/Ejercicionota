package ejercicio1_2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int num1;
		int solucion;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el numero que quieres comprobar");
		num = sc.nextInt();
		num1 = num%7;
		solucion = num1==0 ? 0  :  7-num1;
		System.out.println("La solucion es " + solucion);
		sc.close();
		
		
		
	}

}
