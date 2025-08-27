package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Digite outro número: ");
		double num2 = sc.nextDouble();
		
		double subtracao = num1 - num2;
		
		System.out.println("A subtração de " + num1 + " - " + num2 + " = " + subtracao);

	}

}
