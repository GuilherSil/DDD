package entrada_processamento_saida;

import java.util.Scanner;

public class Ex04 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		double a,b,c,d,media;
		
		System.out.println("Vamos achar a m�dia entre quatro n�meros.");
		System.out.printf("Digite o primeiro n�mero: ");
		a = ler.nextDouble();
		System.out.printf("Digite o segundo n�mero: ");
		b = ler.nextDouble();
		System.out.printf("Digite o terceiro n�mero: ");
		c = ler.nextDouble();
		System.out.printf("Digite o quarto n�mero: ");
		d = ler.nextDouble();
		
		media = (a + b + c + d ) / 4;
		
		System.out.printf("a m�dia � de: %.2f" , media);
		
	}
}
//4. Calcular e exibir a m�dia aritm�tica de quatro valores quaisquer que ser�o digitados.
