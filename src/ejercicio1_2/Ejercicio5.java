package ejercicio1_2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		int x;
		double y;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime que numeros quiere que sea a");
		
		a = sc.nextInt();
		System.out.println("Dime que numeros quiere que sea b");
		
		b = sc.nextInt();
		System.out.println("Dime que numeros quiere que sea c");
		
		c = sc.nextInt();
		System.out.println("Dime que numeros quiere que sea x");
		
		x = sc.nextInt();
		
		
		y = a * (x * x) + b * x + c;
		System.out.println("El resultado del polinomio es " + y);
		sc.close();
		
	}

}
