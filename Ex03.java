package entrada_processamento_saida;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double b,h,area;
		
		System.out.printf("Digite a base do triângulo em cm: ");
		b = ler.nextDouble();
		System.out.printf("Digite a altura do triângulo em cm: ");
		h = ler.nextDouble();
		
		area = (b * h) / 2;
		
		System.out.printf("A área do triângulo é de: %fcm²" , area);
	}
}
//3. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
