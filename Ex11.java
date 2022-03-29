package estrutura_decisao;

import java.util.Scanner;

public class Ex11 {
	public static void main (String []args) {
		Scanner ler = new Scanner(System.in);
		
		double b,h,a;
		
		System.out.println("Vamos achar a área de um terreno retangular!");
		System.out.printf("Primeiro digite a base do retângulo em metros: ");
		b = ler.nextDouble();
		System.out.printf("Agora a altura do retângulo em metros: ");
		h = ler.nextDouble();
		
		a = b * h;
		
		if(a < 100) {
			System.out.printf("Seu terreno tem %.2fm²" , a);
		} else {
			System.out.printf("Seu terreno tem %.2fm². É um terreno grande!", a);
		}
	}
}
