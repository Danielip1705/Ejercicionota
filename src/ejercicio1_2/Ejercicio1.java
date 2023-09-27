package ejercicio1_2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba el numero que quiera redondear");
		num1 = sc.nextDouble();
		num = (int) (num1+0.5);
		System.out.println("El numero redondeado es " +num);
		
		sc.close();
		
		
		
		
		
	}

}
