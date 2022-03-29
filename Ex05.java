package entrada_processamento_saida;

import java.util.Scanner;

public class Ex05 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double c,f;
		
		System.out.println("Vamos converter graus em Celsius para Fahrenheit.");
		System.out.printf("Digite a temperatura em graus Celsius: ");
		c = ler.nextDouble();
		
		f = (c * 9 / 5) + 32;

		System.out.printf("A conversou resultou em %.2f°F" , f);
	}
}
//5. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.
