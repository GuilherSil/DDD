package estrutura_decisao;

import java.util.Scanner;

public class Ex13 {
	public static void main(String []args) {
		Scanner ler = new Scanner(System.in);
		
		double a,b,c;
		
		System.out.println("Vamos achar o maior valor dentre 3 n�meros distintos!");
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextDouble();
		System.out.printf("Digite o segundo valor: ");
		b = ler.nextDouble();
		System.out.printf("Digite o terceiro valor: ");
		c = ler.nextDouble();
		
		if (a > b ) {
			if (a > c) 
				System.out.printf("A � o maior!");
			 else 
				System.out.printf("C � o maior!");
		} else if (b > a) 
			if (b > c) 
				System.out.printf("B � o maior!");
			 else 
				System.out.printf("C � o maior!");
			}	
	}
