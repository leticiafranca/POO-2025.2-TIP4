package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite sua primeira nota: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Digite sua segunda nota: ");
		double n2 = sc.nextDouble();
		
		System.out.println("Digite sua terceira nota: ");
		double n3 = sc.nextDouble();
		
		System.out.println("E por fim, digite sua quarta nota: ");
		double n4 = sc.nextDouble();
		
		double media = (n1 + n2 + n3 + n4) / 4;
		
		if (media >= 7) {
			System.out.println("Sua média é: "+ media + ". Você está APROVADO!");
		}
		
		else {
			System.out.println("Sua média é: "+ media + ". Você está REPROVADO!");
		}
	}

}
