package br.edu.util;

import java.util.Scanner;

public class RecebendoNumI {
	static Scanner sc = new Scanner (System.in);
	public static int recebeNum() {
		System.out.println("Digite um número inteiro: ");
		int num = sc.nextInt();
		return num;
	}
	
	public static int somandoNum(int num) {
		int n = num;
		int soma = 0;
		for (int i =1; i <= n; i++) {
			soma = soma + i;
		}
		return soma;
	}
	
}
