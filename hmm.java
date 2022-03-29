package estrutura_decisao;

import java.util.Scanner;

public class hmm {

	
	    public static void main(String[] args) {
	        Scanner genero = new Scanner(System.in);

	        char sexo;

	        System.out.println("Digite seu sexo: ");
	        sexo = genero.next().charAt(0);
	        sexo = Character.toUpperCase(sexo);

	        switch(sexo){
	          case 'F':
	           System.out.println("Feminino");
	           break;
	          case 'M':
	           System.out.println("Masculino");
	           break;
	          default:
	           System.out.println("Não entendi. Poderia repetir?: ");
	           break;
	         }
	     }
	}