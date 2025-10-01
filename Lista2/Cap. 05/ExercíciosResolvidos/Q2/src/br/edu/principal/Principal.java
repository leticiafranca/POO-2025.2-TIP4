package br.edu.principal;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		int n;
		int e;
		int i;
		int j;
		int fat;
		Scanner dado;
		
		e = 1;
		System.out.println("Insira o valor de n");
		dado = new Scanner(System.in);
		n = dado.nextInt();
		
		for (i = 1; i<n;)
		{
			fat = 1;
			for (j = 1; j<i;)
				fat = fat * j;
			e = e + 1/fat;
		}
		
		System.out.println("O resultado da fórmula é: " + e);
		
		
		
		
	}

}