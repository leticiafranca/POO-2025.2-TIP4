package br.edu.principal;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		int a = 0, b = 0, c = 0, result= 0;
		Scanner dado;
		
		do {
			
			System.out.println("Insira o valor de a: ");
			dado = new Scanner(System.in);
			a = dado.nextInt();
			
		}while(a<1);
		
		System.out.println("Insira o valor de b: ");
		dado = new Scanner(System.in);
		b = dado.nextInt();
		
		System.out.println("Insira o valor de c: ");
		dado = new Scanner(System.in);
		c = dado.nextInt();
		
		result = divisores(a, b, c);
		
		System.out.println("Soma dos divisores = " + result);
		
	}
	
	public static int divisores(int a, int b, int c) {
		int i, r, s;
		
		s = 0;
		
		for (i=b; i<=c; i++) {
			
			r = i%a;
			if (r == 0) {
				s = s + i;
			}
		}
		return s;
	}

}