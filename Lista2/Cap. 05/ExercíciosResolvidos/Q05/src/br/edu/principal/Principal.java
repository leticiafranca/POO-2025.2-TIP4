package br.edu.principal;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		int fim = 0, i, j, x, expoente, num_termos;
		int den = 0, denominador, fat, s;
		int resto = 0;
		
		Scanner dado;
		
		System.out.println("Insira o número de termos: ");
		dado = new Scanner(System.in);
		num_termos  = dado.nextInt();
		
		System.out.println("Insira o valor de x: ");
		dado = new Scanner(System.in);
		x  = dado.nextInt();
		
		s = 0;
		denominador = 1;
		
		for (i=1; i<=num_termos; i++) {
			fim = denominador;
			fat = 1;
			
			for (j = 1; j <= fim; j++) {
				fat = fat * j;
			}
			
			expoente = i + 1;
			resto = (expoente/2);
			
			if (resto == 0) {
				s = (int) (s - Math.pow(x, expoente)/fat);
			}
			else {
				s =(int) (s + Math.pow(x, expoente)/fat);
			}
			
			if (denominador == 4) {
				den = -1;
			}
			
			if (denominador == 1) {
				den = 1;
			}
			if (den == 1) {
				
				denominador = denominador + 1;
				
			}
			else {
				denominador = denominador - 1;
			}
		}
		
		System.out.println("O resultado de s é: " + s);
	}

}