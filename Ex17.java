package estrutura_decisao;

import java.util.Scanner;

public class Ex17 {
public static void main (String []args) {
Scanner ler = new Scanner(System.in);	
		
		double peso,altura,imc;
		char sexo;
		
		System.out.println("Entre com seu sexo, peso e altura para descobrir se est� dentro do peso baseado no seu IMC.");
		System.out.printf("Seu sexo(M ou F): ");
		sexo = ler.next().charAt(0);
        sexo = Character.toUpperCase(sexo);
        System.out.printf("Digite seu peso em kg: ");
        peso = ler.nextDouble();
        System.out.printf("Digite a sua altura (formato x,xx): ");
        altura = ler.nextDouble();
        
        imc = peso / (altura*altura) ;
        
        switch(sexo){
        case 'F':
        	if (imc < 19)
        		System.out.printf("Voc� est� abaixo do peso.");
        	else if (19 <= imc && (imc < 24))
        		System.out.printf("Voc� est� no peso ideal!");
        	else
        		System.out.printf("Voc� est� acima do peso.");
         break;
        case 'M':
        	if (imc < 20)
        		System.out.printf("Voc� est� abaixo do peso. %.2f", imc);
        	else if (20 <= imc && (imc < 25))
        		System.out.printf("Voc� est� no peso ideal! %.2f", imc);
        	else
        		System.out.printf("Voc� est� acima do peso. %.2f", imc);
         break;
        default:
         System.out.println("N�o entendi. Poderia repetir? (Reveja formatos dos valores) ");
         break;
        }
		
	}
}
