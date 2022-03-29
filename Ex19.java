package estrutura_decisao;

import java.util.Scanner;

public class Ex19 {
public static void main (String []args) {
Scanner ler = new Scanner(System.in);	
	
	//MEDIA = (P1 + 2P2) / 3
	double p1, p2, media;
	
	System.out.printf("Digite a nota da P1: ");
	p1 = ler.nextDouble();
	System.out.printf("Digite a nota da P2: ");
	p2 = ler.nextDouble();
	
	media = (p1 + (p2 * 2)) / 3;
	
	if (media >= 5)
		System.out.printf("Aprovado! Média:%.2f", media);
	else
		System.out.printf("Reprovado. Média:%.2f", media);
	
}
}
