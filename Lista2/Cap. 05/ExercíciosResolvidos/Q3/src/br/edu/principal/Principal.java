package br.edu.principal;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		int n, num, i, j, fat;
		Scanner dado;
		
		System.out.println("Insira o valor de N: ");
		dado = new Scanner(System.in);
		n = dado.nextInt();
		
		for (i = 1; i<=n; i++)
		{
			System.out.println("Insira o valor de num: ");
			dado = new Scanner(System.in);
			num = dado.nextInt();
			fat = 1;
			for (j = 1; j<=num; j = j+1)
			{
				fat = fat * j;
			}
			System.out.println("O valor do fatorial de " + num + " é: " + fat);
		}
		
		
	}

}