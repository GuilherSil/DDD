package entrada_processamento_saida;

import java.util.Scanner;

public class Ex07 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a,b,c,d,e,total,pag,troco;
		
		System.out.println("Digite o valor dos produtos um por um.");
		System.out.printf("O preço do primeiro produto: ");
		a = ler.nextDouble();
		System.out.printf("O preço do segundo produto: ");
		b = ler.nextDouble();
		System.out.printf("O preço do terceiro produto: ");
		c = ler.nextDouble();
		System.out.printf("O preço do quarto produto: ");
		d = ler.nextDouble();
		System.out.printf("O preço do quinto produto: ");
		e = ler.nextDouble();
		
		total = a + b + c + d + e;
		
		System.out.printf("O total foi de R$%.2f.", total);
		System.out.printf("Digite o valor do pagamento:");
		pag = ler.nextDouble();
		
		troco = pag - total;
		
		System.out.printf("Troco: R$%.2f", troco);
		
		
	}
}
//7. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco que deverá ser devolvido.
