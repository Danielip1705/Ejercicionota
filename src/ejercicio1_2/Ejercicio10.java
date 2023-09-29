package ejercicio1_2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num;
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿A cuanta distancia has lanzado el algoritmo?");
		num = sc.nextDouble();
		a = (int)num;
		System.out.println("Has lanzado el algoritmo a una distancia de " + a*100);
		
		sc.close();
	}

}
