package entrada_processamento_saida;

import java.util.Scanner;

public class Ex06 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double cot,d,r;
		
		System.out.println("Vamos converter d�lar (US) para real.");
		System.out.printf("Digite a cota��o atual do d�lar: ");
		cot = ler.nextDouble();
		System.out.printf("Digite a quantidade de d�lares: ");
		d = ler.nextDouble();
		
		r = cot * d;
		
		System.out.printf("A convers�o resultou em: R$%.2f", r);
	}
}
//6. Entrar via teclado com o valor da cota��o do d�lar e uma certa quantidade de d�lares. Calcular e exibir o valor correspondente em Reais (R$).
