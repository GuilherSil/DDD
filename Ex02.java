package entrada_processamento_saida;

import java.util.Scanner;

public class Ex02 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		double a,area;
		
		System.out.printf("Digite o valor da aresta do quadrado em cm: ");
		a = ler.nextDouble();
		
		area = a * a;
		
		System.out.printf("A área do quadrado é de: %fcm²" , area);
	}
}
//2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.