package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Digite outro número: ");
		double num2 = sc.nextDouble();
		
		if (num1 < num2) {
			System.out.println("O número menor é: " + num1);
		}
		else if (num2 < num1) {
			System.out.println("O número menor é: " + num2);
		}
		else {
			System.out.println("Os números são iguais.");
		}
	}

}
