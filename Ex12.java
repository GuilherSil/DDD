package estrutura_decisao;

import java.util.Scanner;

public class Ex12 {
	public static void main(String []args) {
		Scanner ler = new Scanner(System.in);
		
		double b,h,a;
		
		System.out.println("Vamos achar a �rea de um terreno de formato retangular!");
		System.out.printf("Primeiro digite o valor da base do ret�ngulo: ");
		b = ler.nextDouble();
		System.out.printf("Agora digite o valor da altura do ret�ngulo: ");
		h = ler.nextDouble();
		
		a = b * h;
		
		if (a >= 100) {
			System.out.printf("O seu terreno mede %.2fm�. � um terreno grande!" , a);
		} else {
			System.out.printf("O seu terreno mede %.2fm�. � um terreno pequeno." , a);
		}
		
	}
}
