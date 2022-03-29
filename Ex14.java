package estrutura_decisao;

import java.util.Scanner;

public class Ex14 {
	public static void main (String []args) {
		Scanner ler = new Scanner(System.in);
		
		double alt,peso,imc;
		
		System.out.println("Vamos descobrir se você está dentro do seu peso baseado pelo seu IMC!");
		System.out.printf("Digite sua altura (formato: x,xx) : ");
		alt = ler.nextDouble();
		System.out.printf("Digite seu peso (apenas kgs, sem gramas): ");
		peso = ler.nextDouble();
		
		imc = peso / (alt*alt);
		
		if ((20 < imc) && (imc < 25)) {
			System.out.printf("Você está dentro do peso! Seu imc:%f" , imc);			
		}
	}
}
