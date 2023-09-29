package ejercicio1_2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//indicamos con la variable int los niños
		int niño;
		
		//indicamos con la variable int los adultos
		int adulto;
		
		//indicamos con la variable double el descuento total
		double descuentototal;
		
		//indicamos con la variable double el total de los niños
		double totalniño;
		
		//indicamos con la variable double el total de los adultos
		double totaladulto;
		
		//indicamos con la variable double el total
		double total;
		
		//indicamos con la variable double el descuento
		double descuento = 5;
		
		//creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en consola la pregunta de cuantas entradas se han comprado para los niños
		System.out.println("¿Cuantas entradas infantiles has comprado?");
		
		//escribe la cantidad de entradas para los niños
		niño = sc.nextInt();
		
		//imprimimos en consola la pregunta de cuantas entradas se han comprado para los adultos
		System.out.println("¿Cuantas entradas para adultos quieres comprar");
		
		//escribe la cantidad de entradas para los adultos
		adulto = sc.nextInt();
		
		//indicamos que el totalniño es la cantidad de entradas * el valor de esta entrada(15.50)
		totalniño = niño*15.50;
		
		//indicamos que el totaladulto es la cantidad de entradas * el valor de esta (20)
		totaladulto = adulto*20;
		
		//indicamos que el total es la suma de total de entradas compradas de niños y adultos
		total = totalniño+totaladulto;
		
		//indicamos con un ternario que si total supera los 100, se le aplica un descuneto del 5% y si no, no se aplica nada
		descuentototal = total>100 ? total-total*descuento/100 : 0;
		
		//imprimimos la respuesta
		System.out.println("Tienes que pagar un total de : " +descuentototal );
		
		//cerramos scanner
		sc.close();
		
		
		
		
		
		
		
		
		
		
	}

}
