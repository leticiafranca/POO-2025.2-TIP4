package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Digite outro número: ");
		double num2 = sc.nextDouble();
		
		System.out.println("Digite mais um número: ");
		double num3 = sc.nextDouble();
		
		double multiplicacao = num1 * num2 * num3;
		
		System.out.println("A multiplicação dos três números recebidos é: " + multiplicacao);

	}

}
