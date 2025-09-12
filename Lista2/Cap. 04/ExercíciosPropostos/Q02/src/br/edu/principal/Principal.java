package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite sua primeira nota: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Digite sua segunda nota: ");
		double n2 = sc.nextDouble();
		
		double media = (n1 + n2) / 2;
		
		if (media >= 7 && media <= 10) {
			System.out.println("Sua média é: "+ media + ". Você está APROVADO!");
		}
		else if (media>=3 && media<7) {
			System.out.println("Sua média é: "+ media + ". Você está no EXAME!");
		}
		else if (media >= 0 && media < 3) {
        System.out.println("Sua média é: " + media + ". Você está REPROVADO!");
		}
        else {
        System.out.println("Nota inválida.");
        }
	}

}
