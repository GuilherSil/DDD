package estrutura_decisao;

import java.util.Scanner;

public class Exemplo01 {
 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        double p1, p2, m;
       
        System.out.printf("Digite a nota da P1: ");
        p1 = ler.nextDouble();
       
        System.out.printf("Digite a nota da P2: ");
        p2 = ler.nextDouble();
       
        m = (p1 + p2) / 2;
       
        if (m >= 5) {
            System.out.printf("A sua m�dia foi %.1f. Portanto voc� est� APROVADO!", m);
        }else {
            System.out.printf("A sua m�dia foi %.1f. Portanto voc� est� REPROVADO!", m);
        }
    }
}
