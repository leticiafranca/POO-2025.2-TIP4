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
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("O número maior é: " + num1);
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println("O número maior é: " + num2);
		}
		else if (num3> num1 && num3 > num2) {
			System.out.println("O número maior é: " + num3);
		}
		else {
			System.out.println("Não foi possível achar o maior. Tente de novo.");
		}
	}

}
