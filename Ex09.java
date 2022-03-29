package estrutura_decisao;

import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a , b;
		
		System.out.println("Digite dois valores para descobrir o menor dentre eles.");
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextDouble();
		System.out.printf("Digite o segundo valor: ");
		b = ler.nextDouble();
		
		if (a < b) {
			System.out.printf("O valor %.2f é menor!", a);
		}else {
			System.out.printf("O valor %.2f é menor!", b);
		}
				
	}
}
