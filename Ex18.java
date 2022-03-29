package estrutura_decisao;

import java.util.Scanner;

public class Ex18 {
public static void main (String []args) {
Scanner ler = new Scanner(System.in);

	//V = v0 + a. t
	double v0, a, t, vf, vfkm;
	
	System.out.printf("Digite a velocidade inicial em m/s: ");
	v0 = ler.nextDouble();
	System.out.printf("Digite a aceleração média em m/s: ");
	a = ler.nextDouble();
	System.out.printf("Digite o tempo decorrido em segundos: ");
	t = ler.nextDouble();
	
	vf = v0 + (a * t);
	vfkm = vf * 3.6;
	
	
	if (vfkm <= 40) 
		System.out.printf("Velocidade final de %.2fkm/h. Veículo muito lento.", vfkm);
	
	else if (vfkm < 60)
		System.out.printf("Velocidade final de %.2fkm/h. Velocidade permitida.", vfkm);
	
	else if (vfkm < 80) 
		System.out.printf("Velocidade final de %.2fkm/h. Velocidade de cruzeiro.", vfkm);
	
	else if (vfkm < 100) 
		System.out.printf("Velocidade final de %.2fkm/h. Veículo rápido.", vfkm);
	
	else
		System.out.printf("Velocidade final de %.2fkm/h. Veículo muito rápido.", vfkm);
	
	


}
}
