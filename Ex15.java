package estrutura_decisao;

import java.util.Scanner;

public class Ex15 {
	public static void main (String []args) {
		Scanner ler = new Scanner (System.in);
		
		int a,b,c;
		
		System.out.println("Vamos descobrir se 3 valores formam um triângulo e seu tipo!");
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextInt();
		System.out.printf("Digite o segundo valor: ");
		b = ler.nextInt();
		System.out.printf("Digite o terceiro valor: ");
		c = ler.nextInt();
		
		if (a+b>c && a+c>b && b+c>a) {
			if ( (a == b ) && (b == c) ) 
			System.out.printf("É um triângulo equilátero!");
		}	
			 else if ((a != b) && (a != c) && (c != b)) 
			System.out.printf("É um triângulo escaleno!");
			
			 else if ( ( (a == b) && (a != c ) ) || ( ( c == a) && (c != b) ) || (c == b) && (c != a) )
			System.out.printf("É um triângulo isósceles!");
		
	
	}
}	


