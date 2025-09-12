package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Digite outro número: ");
		double num2 = sc.nextDouble();

		System.out.println("Escolha uma operação:");
        System.out.println("1 - Média entre os números");
        System.out.println("2 - Diferença do maior pelo menor");
        System.out.println("3 - Produto entre os números");
        System.out.println("4 - Divisão do primeiro pelo segundo");
		int opcao = sc.nextInt();
		
		switch (opcao) {
			case 1: 
				double media = (num1 + num2) / 2;
				System.out.println("A média é: " + media);
				break;
			case 2:
				if (num1 > num2) {
					double diferenca = num1 - num2;
					System.out.println("A diferença é: " + diferenca);
				}
				else if (num2 > num1) {
					double diferenca = num2 - num1;
					System.out.println("A diferença é: " + diferenca);
				}
				else {
					System.out.println("Não tem diferença.");
				}
				break;
			case 3:
				double produto = num1 * num2;
				System.out.println("O produto é: " + produto);
				break;
			case 4:
				if (num2 != 0) {
					double divisao = num1 / num2;
					System.out.println("A divisão é: " + divisao);
				}
				else {
					System.out.println("ERRO: Não é possível dividir por zero (0).");
				}
				break;
			default:
				System.out.println("ERRO: Opção é inválida.");
				break;
		}
	}

}
