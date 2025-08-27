package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a sua primeira nota: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Digite a sua segunda nota: ");
		double n2 = sc.nextDouble();

		double mediaPonderada = ((n1 * 2) + (n2 * 3)) / 5;
		
		System.out.println("A média ponderada das suas notas é: " + mediaPonderada);
	}

}
