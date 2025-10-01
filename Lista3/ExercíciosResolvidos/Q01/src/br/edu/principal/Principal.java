package br.edu.principal;
import java.util.Scanner;

public class Principal {
	
	public static void main(String [] args) {
		
		int num, x;
		Scanner dado;
		
		System.out.println("Insira o valor do número: ");
		dado = new Scanner(System.in);
		num = dado.nextInt();
		
		x = verifica(num);
		
		if (x == 1) {
			System.out.println("Número positivo");
		}
		else {
			System.out.println("Número negativo");
		}
	}
	
	public static int verifica(int num) {
		int res;
		
		if (num>=0) {
			res = 1;
		}
		else {
			res = 0;
		}
		return res;
	}

}
