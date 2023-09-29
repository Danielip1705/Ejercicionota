package ejercicio1_2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//indicamos con la variable int la a
		int a;
		
		////indicamos con la variable int la b
		int b;
		
		////indicamos con la variable int la c
		int c;
		
		//indicamos con la variable int la x
		int x;
		
		//indicamos con la variable double la y
		double y;
	
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en consola que nos escriba el valor a
		System.out.println("Dime que numeros quiere que sea a");
		
		//escribimos el valor a
		
		a = sc.nextInt();
		
		////imprimimos en consola que nos escriba el valor b
		System.out.println("Dime que numeros quiere que sea b");
		
		//escribimos el valor b
		b = sc.nextInt();
		
		////imprimimos en consola que nos escriba el valor c
		System.out.println("Dime que numeros quiere que sea c");
		
		//escribimos el valor c
		c = sc.nextInt();
		
		//imprimimos en consola que nos escriba el valor x
		System.out.println("Dime que numeros quiere que sea x");
		
		//escribimos el valor x
		x = sc.nextInt();
		
		//indicamos que y haga una operacion (polinomio de 2º grado)
		y = a * (x * x) + b * x + c;
		
		//imprimimos el resultado
		System.out.println("El resultado del polinomio es " + y);
		
		//cerramos scanner
		sc.close();
		
	}

}
