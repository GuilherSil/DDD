package estrutura_decisao;

import java.util.Scanner;

public class Ex16 {
public static void main (String []args) {
Scanner ler = new Scanner (System.in);
		
		double cateto1in,cateto2in,hipotenusain;
		double cateto1fn,cateto2fn,hipotenusafn;
		
		System.out.println("Vamos descobrir se 3 valores formam ou não um triângulo retângulo!");
		System.out.printf("Digite o valor do primeiro cateto: ");
		cateto1in = ler.nextDouble();
		System.out.printf("Digite o valor do segundo cateto: ");
		cateto2in = ler.nextDouble();
		System.out.printf("Digite o valor da hipotenusa: ");
		hipotenusain = ler.nextDouble();
		
		cateto1fn = cateto1in * cateto1in;
		cateto2fn = cateto2in * cateto2in;
		hipotenusafn = cateto2fn + cateto1fn ;
		hipotenusafn = Math.sqrt(hipotenusafn);
		
		if (hipotenusain == hipotenusafn)
			System.out.printf("É um triângulo retângulo! (valores iniciais: %.2f , %.2f e %f.) (valores finais: %.2f , %.2f e %f.)", cateto1in, cateto2in, hipotenusain, cateto1fn, cateto2fn, hipotenusafn);
		else
			System.out.printf("Não é um triângulo retângulo! (valores iniciais: %.2f , %.2f e %f.) (valores finais: %.2f , %.2f e %f.)", cateto1in, cateto2in, hipotenusain, cateto1fn, cateto2fn, hipotenusafn);
	}
}
