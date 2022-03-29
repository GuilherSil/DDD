package entrada_processamento_saida;

import java.util.Scanner;

public class Ex01 {
	public static void main(String [] args) {
		Scanner ler = new Scanner (System.in);
		
		double b,h,area;
		
		
		System.out.printf("Digite a base do retângulo em cm: ");
		b = ler.nextDouble();
		System.out.printf("Digita a altura do retângulo em cm: ");
		h = ler.nextDouble();
		
		area = b * h;
		
		System.out.printf("A área do retângulo é de: %fcm²" ,area);
	}
}
//Calcular a área de um retângulo