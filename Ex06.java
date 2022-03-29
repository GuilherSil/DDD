package entrada_processamento_saida;

import java.util.Scanner;

public class Ex06 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double cot,d,r;
		
		System.out.println("Vamos converter dólar (US) para real.");
		System.out.printf("Digite a cotação atual do dólar: ");
		cot = ler.nextDouble();
		System.out.printf("Digite a quantidade de dólares: ");
		d = ler.nextDouble();
		
		r = cot * d;
		
		System.out.printf("A conversão resultou em: R$%.2f", r);
	}
}
//6. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. Calcular e exibir o valor correspondente em Reais (R$).
