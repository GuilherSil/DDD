package entrada_processamento_saida;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double b,h,area;
		
		System.out.printf("Digite a base do tri�ngulo em cm: ");
		b = ler.nextDouble();
		System.out.printf("Digite a altura do tri�ngulo em cm: ");
		h = ler.nextDouble();
		
		area = (b * h) / 2;
		
		System.out.printf("A �rea do tri�ngulo � de: %fcm�" , area);
	}
}
//3. A partir dos valores da base e altura de um tri�ngulo, calcular e exibir sua �rea.
