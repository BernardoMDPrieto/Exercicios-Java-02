package SomenteADorColetiva02;

import java.util.Scanner;

public class Exercicio02 {

	
	static boolean valorPrimo(int valor) {
		int divisores = 0;
		if(valor < 2) {
			return false;
		}else {
		for(int contadora = 1;contadora <= valor; contadora++) {
			if(valor%contadora==0) {
				divisores++;
			}
		}
		
		if(divisores < 3) {
			return true;
			} else {
				return false;
			}
		}
			
	}
	
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um valor");
		int valor = leia.nextInt();
		System.out.println(Exercicio02.valorPrimo(valor));
		leia.close();
		
		
	}

}
