package SomenteADorColetiva02;

import java.util.Scanner;

public class Exercicio01 {
	
	
	static int soma(int valor01,int valor02) {
		return valor01+valor02;
	}
	
	
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um valor");
		int valor01 = leia.nextInt();
		System.out.println("Informe outro valor");
		int valor02 = leia.nextInt();
		System.out.println("A soma dos valore é: "+Exercicio01.soma(valor01,valor02));
		leia.close();
		
	}
}
