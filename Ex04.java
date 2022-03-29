package entrada_processamento_saida;

import java.util.Scanner;

public class Ex04 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		double a,b,c,d,media;
		
		System.out.println("Vamos achar a média entre quatro números.");
		System.out.printf("Digite o primeiro número: ");
		a = ler.nextDouble();
		System.out.printf("Digite o segundo número: ");
		b = ler.nextDouble();
		System.out.printf("Digite o terceiro número: ");
		c = ler.nextDouble();
		System.out.printf("Digite o quarto número: ");
		d = ler.nextDouble();
		
		media = (a + b + c + d ) / 4;
		
		System.out.printf("a média é de: %.2f" , media);
		
	}
}
//4. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.
