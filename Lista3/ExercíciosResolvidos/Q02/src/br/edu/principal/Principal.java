package br.edu.principal;
import java.util.Scanner;

public class Principal {
	
	public static void main(String [] args) {
		
		int num1, num2, s;
		Scanner dado;
		
		System.out.println("Insira o primeiro número: ");
		dado = new Scanner(System.in);
		num1 = dado.nextInt();
		
		System.out.println("Insira o segundo número: ");
		dado = new Scanner(System.in);
		num2 = dado.nextInt();
		
		s = soma(num1, num2);
		System.out.println("Soma = " + s);
			
	}
	
	public static int soma(int num1, int num2) {
		int i, s = 0;
		for (i = num1 + 1; i<= num2-1; i++) {
			s = s + i;
		}
		return s;
	}

}
