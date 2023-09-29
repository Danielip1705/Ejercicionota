package ejercicio1_2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int niño;
		int adulto;
		double descuentototal;
		double totalniño;
		double totaladulto;
		double total;
		final double descuento = 5;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuantas entradas infantiles has comprado?");
		niño = sc.nextInt();
		
		System.out.println("¿Cuantas entradas para adultos quieres comprar");
		adulto = sc.nextInt();
		
		totalniño = niño*15.50;
		
		totaladulto = adulto*20;
		
		total = totalniño+totaladulto;
		
		descuentototal = total>100 ? total-total*descuento/100 : 0;
		
		System.out.println("Tienes que pagar un total de :" +descuentototal );
		sc.close();
		
		
		
		
		
		
		
		
		
		
	}

}
