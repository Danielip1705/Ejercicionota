package ejercicio1_2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base;
		int altura;
		double solucion;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime que base y altura ");
		
		base = sc.nextInt();
		altura = sc.nextInt();
		solucion = (base*altura)/2;
		
		System.out.println("El resultado es: " + solucion);
		sc.close();
	}

}
