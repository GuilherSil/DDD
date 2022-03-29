package estrutura_decisao;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a,b;
		
		System.out.println("Digite dois valores para descobrir o maior dentre eles, ou se são valores iguais.");
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextDouble();
		System.out.printf("Digite o segundo valor: ");
		b = ler.nextDouble();
		
		if (a > b) {
			System.out.printf("O valor %.2f é maior que %.2f!" , a , b);
		}else if (a == b) {
			System.out.printf("O primeiro valor (%.2f) é igual ao segundo valor (%.2f)!" , a , b);
		}else {
			System.out.printf("O valor %.2f é maior que %.2f!" , b , a);
		}
		
	}
}
