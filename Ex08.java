package estrutura_decisao;

import java.util.Scanner;

public class Ex08 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a , b;
		
		System.out.println("Digite dois números para saber qual o maior!");
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextDouble();
		System.out.printf("Digite o segundo valor: ");
		b = ler.nextDouble();
		
		if (a > b) {
			System.out.printf("O valor %.2f é maior!", a);
		}else {
			System.out.printf("O valor %.2f é maior!", b);
		}
	}
}
