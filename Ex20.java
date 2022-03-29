package estrutura_decisao;

import java.util.Scanner;

public class Ex20 {
public static void main (String []args) {
Scanner ler = new Scanner(System.in);
	
    //MEDIA = (P1 + 2P2) / 3
	double p1, medianc;
	
	System.out.printf("Digite a nota da P1: ");
	p1 = ler.nextDouble();
	
	medianc = 0;
	medianc = (15 - p1 ) / 2;
	
	System.out.printf("Nota mínima necessária na P2 para aprovação: %.2f. ", medianc);
	System.out.printf("medianc = (P1 + 2P2) / 3 -- medianc = (%.2f + 2.%.2f) / 3" , p1, medianc);

}
}
